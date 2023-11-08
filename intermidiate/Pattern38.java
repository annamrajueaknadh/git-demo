import java.util.Scanner;

public class Pattern38
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
                for(j=1;j<=n;j++)
                {
                
                    System.out.print("*");
                }
            System.out.println("");
        }
        
    }
}