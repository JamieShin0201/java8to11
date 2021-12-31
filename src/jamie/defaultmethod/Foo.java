package jamie.defaultmethod;

public interface Foo {

    void printName();

    String getName();

    /**
     * @implSpec getName()으로 가져온 문자열을 대문자로 바꿔 출력합니다.
     */
    default void printNameUppercase() {
        System.out.println(getName().toUpperCase());
    }

    static void print() {
        System.out.println("This is Foo class");
    }
}
