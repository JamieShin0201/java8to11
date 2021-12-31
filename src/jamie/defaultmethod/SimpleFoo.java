package jamie.defaultmethod;

public class SimpleFoo implements Foo {

    private String name;

    public SimpleFoo(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
