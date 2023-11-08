import java.util.Scanner;

public class Pattern41
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {

                System.out.print(" ");
            }
                for(j=1;j<=2*i-1;j++)
                {
                    if(i==1 || j==1 || i==n|| j==2*i-1)
                    {

                        System.out.print("*");
                    }
                    else{
                    System.out.print(" ");
                    }
                }
            System.out.println(""); 
        }
        
    }
}