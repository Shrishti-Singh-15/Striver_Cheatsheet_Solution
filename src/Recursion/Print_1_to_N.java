package Recursion;

import java.util.Scanner;

public class Print_1_to_N {
    public static void func(int n) {
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        func(n);
    }
}
