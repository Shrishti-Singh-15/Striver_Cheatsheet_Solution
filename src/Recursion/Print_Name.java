package Recursion;

import java.util.Scanner;

public class Print_Name {
    public static void func(int n, String s) {
        if(n == 0){
            return;
        }
        System.out.println(s);
        func(n-1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print: ");
        int n = sc.nextInt();
        System.out.print("Enter the name: ");
        String s = sc.next();
        func(n, s);
    }
}
