package Basic_Maths;

import java.util.Scanner;

public class Armstrong_Number {
    public static void Armstrong_Number(int n) {
        int sum = 0;
        int digit = 0;
        int temp = n;
        while (n != 0) {
            digit = n % 10;
            int val = digit * digit * digit;
            sum = sum + val;
            n /= 10;
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        Armstrong_Number(number);
    }
}
