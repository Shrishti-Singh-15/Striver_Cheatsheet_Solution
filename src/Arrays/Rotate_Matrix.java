package Arrays;

import java.util.Scanner;

public class Rotate_Matrix {
    public static void rotate_matrix(int matrix[][]){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j< n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n; i++){
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] matrix){
        int start = 0, end = matrix.length-1;
        while (start < end){
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the column size of the array: ");
        int m = sc.nextInt();

        int[][] matrix = new int[m][n];
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate_matrix(matrix);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
