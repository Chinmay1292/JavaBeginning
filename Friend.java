public class Friend {
    public static void main(String[] args)
    {
        Box1 b = new Box1();
        b.x = 100;
        b.f();

        Parcel p = new Parcel();
        p.x = 300;
        p.f();
    }
}

class Parcel extends Box1{
    void g()
    {
        Box1 b = new Box1();
        b.x =100;
    }
}
