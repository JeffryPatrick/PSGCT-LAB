package ProblemSheet4;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

    public static int[][] reshape(int[][] arr, int row, int column, int reshapeRow, int reshapeColumn) {
        if ((row * column) != (reshapeRow * reshapeColumn))
            return arr;

        int[][] reshapeArray = new int[reshapeRow][reshapeColumn];
        int insertRow = 0, insertCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (insertRow < reshapeRow && insertCol < reshapeColumn) {
                    reshapeArray[insertRow][insertCol] = arr[i][j];
                    insertCol++;
                } else {
                    insertCol = 0;
                    insertRow++;
                    reshapeArray[insertRow][insertCol] = arr[i][j];
                    insertCol++;
                }
            }
        }

        return reshapeArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, column, reshapeRow, reshapeColumn;

        System.out.println("Enter a row : ");
        row = scanner.nextInt();

        System.out.println("Enter a column : ");
        column = scanner.nextInt();

        int[][] input = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter a Reshape Row : ");
        reshapeRow = scanner.nextInt();

        System.out.println("Enter a Reshape Column : ");
        reshapeColumn = scanner.nextInt();

        int[][] result = reshape(input, row, column, reshapeRow, reshapeColumn);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
