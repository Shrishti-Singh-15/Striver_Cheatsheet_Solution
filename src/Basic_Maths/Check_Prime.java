package Basic_Maths;

import java.util.Scanner;

public class Check_Prime {
    public static void Check_Prime(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                count++;
            }
        }
        if(count <= 2) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        Check_Prime(number);
    }
}
