import java.util.Scanner;

public class Pattern22{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of Stars u want : ");
        int n=s.nextInt();
        int i,j;
        int alphabet=65;
        for(i=alphabet;i<=alphabet+n;i++){
            for(j=i;j<=alphabet+n;j++){
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}