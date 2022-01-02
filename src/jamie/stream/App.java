package jamie.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jamie");
        names.add("Sunny");
        names.add("Suk");
        names.add("Ha");

        // 중개 오퍼레이션은 lazy 하다.
        Stream<String> namesStream = names.stream().map(s -> {
            System.out.println("lazy");
            return s.toUpperCase();
        });

        System.out.println("=================");
        namesStream.forEach(System.out::println);

        System.out.println();
        names.stream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println();
        names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
    }
}
