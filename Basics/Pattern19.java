import java.util.Scanner;

public class Pattern19{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of Stars u want : ");
        int n=s.nextInt();
        int i,j;
        int alphabet=65;
        for(i=alphabet+n;i>=alphabet;i--){
            for(j=i;j>=alphabet;j--){
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}