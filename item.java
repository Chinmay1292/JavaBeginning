import java.lang.String;

public class item {
    public static void main(String[] args)
    {
        int length;
        String str1;
        str1 = "VIT Bhopal"; 
        length = str1.length();
        System.out.println(str1 + " has " + length + " characters");
        String str2 = new String("VIT"); // new constructer()
        length = str2.length();
        System.out.println(str2 + " has " + length  + " characters ");
        if(str1.equals(str2))
        System.out.println("Both are equal");
        else
        System.out.println("Both are different");
        if("VIT".equals(str1))
        System.out.println("Both are equal");
        else
        System.out.println("Both are different");
        System.out.println(str1.toUpperCase());
        System.out.println(str1);

    }
}
