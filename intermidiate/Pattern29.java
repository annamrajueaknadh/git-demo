import java.util.Scanner;

public class Pattern29
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j,k;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>=i;k--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(i=2;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=n;k++)
            {
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}