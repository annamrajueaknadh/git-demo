import java.util.Scanner;

public class Pattern35
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n+1;i++)
        {
            for(j=i;j<=n+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}