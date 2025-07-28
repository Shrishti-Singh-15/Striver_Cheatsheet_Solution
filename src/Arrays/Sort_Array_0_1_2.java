package Arrays;

import java.util.Scanner;

public class Sort_Array_0_1_2 {
    public static void sort(int[] arr){
        int count0=0, count1=0, count2=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else if(arr[i] == 2){
                count2++;
            }
        }
        for(int i=0; i<count0; i++){
            arr[i] = 0;
        }
        for(int i=count0; i< count0+count1; i++){
            arr[i] = 1;
        }
        for(int i=count0+count1; i<arr.length; i++){
            arr[i] = 2;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i< n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
