package ClassProblems;

import java.util.Scanner;

public class RowColumn {

    static void rowColumnSum(int[][] arr, int row, int column) {
        int rowSum = 0, columnSum = 0, diagonalSum1 = 0, diagonalSum2 = 0;

        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            rowSum = 0;
            columnSum = 0;
            for (int colIndex = 0; colIndex < column; colIndex++) {
                rowSum += arr[rowIndex][colIndex];
                columnSum += arr[colIndex][rowIndex];
                if(rowIndex == colIndex) {
                    diagonalSum1 += arr[rowIndex][colIndex];
                }
                if((rowIndex + colIndex) == (row - 1)) {
                    diagonalSum2 += arr[rowIndex][colIndex];
                }
            }
            System.out.println("Row " + (rowIndex + 1) + " Sum = " + rowSum);
            System.out.println("Col " + (rowIndex + 1) + " Sum = " + columnSum);
        }

        System.out.println("Diagonal sum 1 : " + diagonalSum1);
        System.out.println("Diagonal sum 2 : " + diagonalSum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;

        row = in.nextInt();
        column = in.nextInt();

        int[][] input = new int[row][column];

        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int colIndex = 0; colIndex < column; colIndex++) {
                input[rowIndex][colIndex] = in.nextInt();
            }
        }

        rowColumnSum(input, row, column);
    }
}
