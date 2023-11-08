import java.util.Scanner;

public class Pattern46
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j,k=1;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+"");
            }
            for(k=2;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}