import java.util.Scanner;

public class Pattern1{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter  done no.of Stars u want : ");
        int n=s.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}