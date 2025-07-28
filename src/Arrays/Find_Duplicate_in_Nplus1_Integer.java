package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Find_Duplicate_in_Nplus1_Integer {
    public static int duplicate(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = duplicate(arr);
        System.out.println("The result is: " + result);
    }
}
