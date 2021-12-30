package jamie.functional;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public int doIt(int number) {
                return number + 10;
            }
        };
        System.out.println(runSomething1.doIt(10));

        // 람다 표현식
        RunSomething runSomething2 = number ->  number + 10;
        System.out.println(runSomething2.doIt(20));
    }
}
