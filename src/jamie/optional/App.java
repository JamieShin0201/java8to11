package jamie.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> classes = new ArrayList<>();
        classes.add(new OnlineClass(1, "python", true));
        classes.add(new OnlineClass(2, "rest api development", false));

        Optional<OnlineClass> optional = classes.stream()
                .filter(oc -> oc.getTitle().startsWith("spring")).findFirst();
        // optional.orElseThrow(() -> new IllegalStateException());
        OnlineClass springClass = optional.orElseGet(() -> new OnlineClass(3, "spring class", false));
        System.out.println(springClass.getTitle());

        OnlineClass springBootClass = optional.orElse(new OnlineClass(3, "spring boot", true));
        System.out.println(springBootClass.getTitle());

        // orElse 는 해당 값에 상관없이 실행된다.
        // orElseGet 메소드는 해당 값이 null 일 때만 불린다.
        Optional<OnlineClass> anotherOptional = classes.stream()
                .filter(oc -> oc.getTitle().startsWith("python")).findFirst();
        anotherOptional.orElse(createNewClass());
        anotherOptional.orElseGet(App::createNewClass);
    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    }
}
