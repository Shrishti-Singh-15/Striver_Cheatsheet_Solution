import java.util.Scanner;

public class Check_Pallindrome {
    public static boolean isPallindrome(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;
        if(n<0){
            return false;
        }
        while (temp != 0) {
            count = temp % 10;
            sum = sum*10 + count;
            temp = temp / 10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        boolean result = isPallindrome(n);
        System.out.println(result);
    }
}
