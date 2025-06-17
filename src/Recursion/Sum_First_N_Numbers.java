package Recursion;

import java.util.Scanner;

public class Sum_First_N_Numbers {
    public static long Func(long n) {
        if(n==0) {
            return 0;
        }
        return (long) Math.pow(n,3) + Func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextInt();
        long output = Func(n);
        System.out.println("The sum is" + output);
    }
}
