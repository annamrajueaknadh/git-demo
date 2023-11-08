import java.util.Scanner;

public class Pattern44
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int i,j,k=1,p;
        System.out.println("enter how many stars u want : ");
        int n = s.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(k+"");
                k++;
            }
            for(j=i-1;j>=1;j--)
            {
                p=k-2;
                k--;
                System.out.print(p+"");
            }
            System.out.println("");
        }
    }
}