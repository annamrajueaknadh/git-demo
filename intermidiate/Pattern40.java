import java.util.Scanner;

public class Pattern40
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
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