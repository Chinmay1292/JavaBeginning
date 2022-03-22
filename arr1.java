import java.lang.String;
public class arr1 {
    public static void main(String[] args)
    {
        int[] x;
        x = new int[5];
        x[0] = 10;
        x[1] = 20;
        x[2] = x[0] + x[1];
        x[3] = 40;
        x[4] = x[2] + x[3];
        for(int i=0; i<x.length; i++)
        System.out.println(x[i]);
    }
    
}
