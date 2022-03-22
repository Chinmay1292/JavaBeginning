import java.lang.String;
public class arr {
    public static void main(String[] args)
    {
        int x[];
        x = new int[5];
        for(int i =0; i<x.length; i++)
        System.out.println(x[i]);

        x[0] = 10;
        x[1] = 20;
        x[2] = x[0] + x[1];
        x[3] = 40;
        x[4] = x[2] + x[3];
        for(int i=0; i<x.length; i++)
        System.out.println(x[i]);

        String[] names;
        names = new String[3];
        for (int i=0; i<names.length; i++)
        System.out.println(names[i]);
    }
}
