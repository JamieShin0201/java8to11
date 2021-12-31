package jamie.defaultmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        Foo foo = new SimpleFoo("Jamie");
        foo.printName();
        foo.printNameUppercase();
        Foo.print();

        List<String> names = new ArrayList<>();
        names.add("Jamie");
        names.add("Sunny");
        names.add("Suk");
        names.add("Ha");

        names.forEach(System.out::println);
        System.out.println();

        Spliterator<String> spliterator1 = names.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        while (spliterator1.tryAdvance(System.out::println)) ;
        while (spliterator2.tryAdvance(System.out::println)) ;
    }
}
