package Arrays;

import java.util.Map;
import java.util.Scanner;

public class Kadanes_Algorithm {
    public static int func(int[] arr){
        int res = arr[0];
        int total = 0;

        for(int a:arr){
            if(total < 0){
                total = 0;
            }
            total = total+a;
            res = Math.max(total, res);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrray: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[n];
        for(int i=0;i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result = func(arr);
        System.out.println("The result is: " + result);
    }
}
