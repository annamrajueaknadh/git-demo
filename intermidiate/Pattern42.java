import java.util.Scanner;

public class Pattern42
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j,k=1;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println("");
        }
    }
}