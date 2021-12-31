package jamie.defaultmethod;

public class App {

    public static void main(String[] args) {
        Foo foo = new SimpleFoo("Jamie");
        foo.printName();
        foo.printNameUppercase();
        Foo.print();
    }
}
