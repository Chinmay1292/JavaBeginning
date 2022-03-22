import java.util.*;
class arrsort{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=0; 
        
        int i,j,temp;
        System.out.println("Enter length of array");
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element number: "+(i+1));
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++){
                if(a[j+1]<a[j]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        
        }
    }

}
