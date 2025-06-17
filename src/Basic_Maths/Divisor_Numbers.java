package Basic_Maths;

import java.util.Scanner;

public class Divisor_Numbers {
    public static void  Divisor_Numbers(int n) {
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        Divisor_Numbers(n);
    }
}
