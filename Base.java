public class Base {
    void f()
    {
        System.out.println("Base");
    }
}

class Derived extends Base{
    void f()
    {
        System.out.println("derived");
    }

    void g()
    {
        System.out.println("G");
    }
}

class TestBinding
{
    public static void main(String[] args)
    {
        Base base = new Base();
        base.f();

        Derived derived = new Derived();
        derived.f();

        base = derived;
        base.f();
        base.g();

    }
}
