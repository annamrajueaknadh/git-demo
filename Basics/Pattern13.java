import java.util.Scanner;

public class Pattern13{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of Stars u want : ");
        int n=s.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}