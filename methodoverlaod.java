public class methodoverlaod {
    public static void main(String[] args)
    {
        greet();
        greet("Welcome");
    }
    static void greet()
    {
        System.out.println("Hello");
    }
    static void greet(String msg)
    {
        System.out.println(msg);

    }
}
