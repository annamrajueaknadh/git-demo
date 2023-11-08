import java.util.Scanner;

public class Pattern37
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j ||i==1 || j==1|| j==n || i==n|| j==n-i+1 || i+j==n+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}