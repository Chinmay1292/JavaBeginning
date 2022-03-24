public class laptop {
    int size;
    int storage;

    laptop(int size, int stroage)
    {
        this.size = size;
        this.storage = storage;
    }

    laptop()
    {
        size = 0;
        storage = 0;
    }

    laptop(int i)
    {
        size=storage=i;
    }

    int calarea()
    {
        return this.size*storage;
    }

    void show()
    {
        System.out.println("size: " + size);
        System.out.println("storage: " + storage);
    }

    public static void main(String[] args)
    {
        laptop l = new laptop();
        l.show();
    }    
}
