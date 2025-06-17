package Recursion;

import java.util.Scanner;

public class Print_N_times {
    public static void func(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        func(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you would like to print");
        int n = sc.nextInt();
        func(n);
    }
}
