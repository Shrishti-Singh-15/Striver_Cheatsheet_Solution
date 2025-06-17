package Recursion;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void Func(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        Func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Func(n);
    }
}
