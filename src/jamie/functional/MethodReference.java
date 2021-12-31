package jamie.functional;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    public static void main(String[] args) {
        // 생성자 참조
        Supplier<Greeting> greetingSupplier = Greeting::new;
        Greeting greeting = greetingSupplier.get();

        // 특정 객체의 인스턴스 메소드 참조
        UnaryOperator<String> sayHello = greeting::hello;
        System.out.println(sayHello.apply("jamie"));

        // 스태틱 메소드 참조
        UnaryOperator<String> sayHi = Greeting::hi;
        System.out.println(sayHi.apply("jamie"));

        // 임의의 객체의 인스턴스 메소드 참조
        String[] names = {"jamie", "sunny", "shin"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
