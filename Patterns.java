public class Patterns {
    public static void pattern1()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern2()
    {
        int n=5;
        int a=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(a)+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void pattern3()
    {
        int n=5;
       
        for(int i=1;i<=n;i++)
        {
            int a=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(a)+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void pattern4()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5() 
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
         {
            for (int j = 1; j <= i; j++)
             {
                if (((i + j) & 1) == 0)
                 {
                    System.out.print(1+" ");
                }
                 else 
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
    public static void pattern6()
    {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern7() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
       pattern5();
       pattern6();
       pattern7();
    }
}
