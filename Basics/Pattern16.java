import java.util.Scanner;

public class Pattern16{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of Stars u want : ");
        int n=s.nextInt();
        int i,j;
        int alphabet=65;
        for(i=alphabet+n;i>=alphabet;i--){
            for(j=alphabet+n;j>=i;j--){
                System.out.print((char)i+ " ");
            }
            System.out.println();
        }
    }
}