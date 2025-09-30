package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {
    public static void sorted_Array(int[] nums1, int m, int[] nums2, int n){
        //System.arraycopy(nums2, 0, nums1, m, n);
        //Arrays.sort(nums1);

        int c = m+n;
        int arr[] = new int[c];
        for(int i=0; i<m; i++){
            arr[i] = nums1[i];
        }
        for(int i = m; i<m+)
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m (number of elements in nums1): ");
        int m = sc.nextInt();

        System.out.print("Enter n (number of elements in nums2): ");
        int n = sc.nextInt();

        // Allocate size m + n for nums1
        int nums1[] = new int[m + n];
        int nums2[] = new int[n];

        System.out.println("Enter " + m + " elements for nums1:");
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements for nums2:");
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        sorted_Array(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
