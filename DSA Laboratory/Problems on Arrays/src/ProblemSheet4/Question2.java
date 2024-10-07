package ProblemSheet4;

import java.util.Scanner;

/*
 * Input
 *    4  3  2 -1
 *    3  2  1 -1
 *    1  1 -1 -2
 *   -1 -1 -2 -3
 * Output
 *   8
 * */

public class Question2 {

    public static int negativeNumbers(int[][] arr, int row, int column) {
        int negativeNumbersCount = 0;

        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int columnIndex = 0; columnIndex < column; columnIndex++) {
                if (arr[rowIndex][columnIndex] < 0) {
                    negativeNumbersCount += (column - columnIndex);
                    break;
                }
            }
        }

        return negativeNumbersCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, column;

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

        System.out.println(negativeNumbers(input, row, column));
    }
}
