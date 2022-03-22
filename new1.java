public class new1 {
    public static void main(String[] args)
    {
          float x;
          int n, terms;
          n = 2;
          terms = 3;
          x = 1;
          byte sign = -1;
          for(int i = 2; i<=terms; i++)
          {
              int fact=1;
              for(int j = 1; j<=i; j++)
                  fact= fact * j;
              x = ((-1) * sign * (float) n) / fact;
          }
          System.out.println(" x = " + x);
    }
}

