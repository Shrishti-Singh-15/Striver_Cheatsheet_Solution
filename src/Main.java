import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Count_Digit(int n) {
        int num = 0;
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n%10;
            num++;
            n = n/10;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Count_Digit(n);
    }
}