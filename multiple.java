public class multiple {
    public static void main(String[] args)
    {
        int number = 5;
        int times = 10;
        printMultiplicationTable(number, times);
    }
    static void printMultiplicationTable(int number , int times ){
        for(int i=1;i<=times;i++){
            System.out.println(number +"*"+i+"="+(number*i));
        }
    }
}
