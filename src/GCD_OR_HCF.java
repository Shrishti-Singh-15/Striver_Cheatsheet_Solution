import java.util.Scanner;

public class GCD_OR_HCF {
    public static int GCD_OR_HCF(int a, int b){
        while(b>0 && a>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(b==0){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter the first number" );
        int a = in.nextInt();
        System.out.println( "Enter the second number" );
        int b = in.nextInt();
        int res = GCD_OR_HCF(a,b);
        System.out.println( "The GCD is: " + res);
    }
}
