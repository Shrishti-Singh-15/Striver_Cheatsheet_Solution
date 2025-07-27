package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Pascals_Triangle {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j=1; j<i; j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows pascal's triangle needs to be printed: ");
        int numRows = sc.nextInt();

        Pascals_Triangle pt = new Pascals_Triangle();
        List<List<Integer>> triangle = pt.generate(numRows);

        System.out.println("Pascal's Triangle: ");
        for(List<Integer> row: triangle){
            for(Integer num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
