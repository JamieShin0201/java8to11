package jamie.functional;

/**
 * 추상 메소드를 딱 하나만 가지고 있는 인터페이스
 */
@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    default void doSomething() {
        System.out.println("doSomething");
    }

    static void doEverything() {
        System.out.println("doEverything");
    }
}
