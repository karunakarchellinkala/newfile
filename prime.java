import java.util.Scanner;
class prime
{
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int  n=sc.nextInt();
       if(n<=1)
	       System.out.println("not prime");
       if(n==2)
          System.out.println("prime");
       int f=0;
       for (int i=2;i<=n;i++)
       {
          if(n%i==0)
          {
       		 f=f+1;
		       break;
	       }
       }
    }
}

