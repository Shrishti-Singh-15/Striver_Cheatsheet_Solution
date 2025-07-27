package Arrays;

import java.util.Scanner;

public class Set_Matrix_Zero {
    public static void setMatrix0(int matrix[][], int m, int n){
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size of array: ");
        int m = sc.nextInt();
        System.out.print("Enter the columen size of the array: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        setMatrix0(matrix, m, n);

        System.out.println("Updated matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
