import java.util.Scanner;

public class Reverse_Number {
    public static void Reverse_Number(int num) {
        int temp = num;
        int digit = 0;
        while (temp != 0) {
            digit = temp % 10;
            System.out.print(digit);
            temp /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Reverse_Number(n);
    }
}
