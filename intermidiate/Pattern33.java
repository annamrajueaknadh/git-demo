import java.util.Scanner;

public class Pattern33
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}