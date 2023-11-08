import java.util.Scanner;

public class Pattern32
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j,k;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*"+"");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*"+"");

            }
            System.out.println();
        }
    }
}