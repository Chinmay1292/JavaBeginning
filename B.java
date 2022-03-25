public class B {
    public static int x;
    
    public void f(){
        x = 100;
    }
}

class C {
    public static void main(String[] args)
    {
        B b = new B();
        b.f();
        System.out.println("x: " + b);
    }

}
