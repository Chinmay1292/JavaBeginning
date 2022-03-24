public class Box {
    private static int x;
    
    public void f(){
        x =200;
    }

    public static void main(String[] args){
        System.out.println("x: " + x);
    }
}

class friend {
    void giveGift()
    {
        Box gift = new Box();
        gift.x = 100;
        gift.f();
    }
}

class Parcel extends Box{
    void d()
    {
        Box s2 = new Box();
        s2.f();
    }
}
