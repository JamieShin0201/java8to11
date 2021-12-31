package jamie.functional;

import java.util.function.*;

public class Functional {

    public static void main(String[] args) {
        // T 타입을 받아 R 타입을 리턴
        Function<Integer, String> integerToString = number -> String.valueOf(number);
        System.out.println(integerToString.apply(50) instanceof String);

        // 함수 조합용 메서드 (compose, andThen)
        Function<Integer, Integer> plus10 = number -> number + 10;
        Function<Integer, Integer> multiply2 = number -> number * 2;
        System.out.println(plus10.compose(multiply2).apply(10));
        System.out.println(plus10.andThen(multiply2).apply(10));

        // T, U 두개의 값을 받아서 R 타입을 리턴
        BiFunction<Integer, Integer, Integer> plus = (number1, number2) -> number1 + number2;
        System.out.println(plus.apply(10, 20));

        // T 타입을 받아 아무값도 리턴하지 않음
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello world");

        // 매개변수 없이 T 타입의 값을 리턴
        Supplier<Integer> one = () -> 1;
        System.out.println(one.get());

        // T 타입을 받아 boolean 을 리턴
        Predicate<Integer> isTwo = number -> number == 2;
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isTwo.test(2));
        System.out.println(isTwo.and(isEven).test(4));

        // Function<T, R> 의 특수항 형태로, T 타입을 받아 T 타입을 리턴
        UnaryOperator<Integer> plus5 = number -> number + 5;
        System.out.println(plus5.apply(10));
    }
}
