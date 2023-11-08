import java.util.Scanner;

public class Pattern27
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
            for(k=1;k<=i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=n-i;k++)
            {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}