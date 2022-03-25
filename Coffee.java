public class Coffee {
    void makeCoffee()
    {
        System.out.println("Coffee");
    }
}

class Cappucino extends Coffee{
    void makeCoffee()
    {
        System.out.println("Cappucino");
    }
}

class Coffee1{
    public static void main(String[] args)
    {
        Coffee c = new Coffee();
        c.makeCoffee();

        Cappucino C = new Cappucino();
        C.makeCoffee();
    }
}