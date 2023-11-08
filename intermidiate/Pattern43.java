import java.util.Scanner;

public class Pattern43
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
                if(j%2==0)
                System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println("");
        }
    }
}