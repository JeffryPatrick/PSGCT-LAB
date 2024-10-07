package ProblemSheet4;

import java.util.Scanner;

/*
 * Input:
 *   1 2 3 4
 *   5 1 2 3
 *   9 5 1 2
 *
 * Output:
 *   true
 * */

public class Question1 {

    public static boolean isToeplitz(int[][] arr, int row, int column) {

        int rowIndex = 1, colIndex = 0;
        int checkRow = 0, checkCol = 0;
        int temp;

//        top right triangle
        while (colIndex < column) {
            temp = arr[0][colIndex];
            checkRow++;
            checkCol++;

            while (checkRow < row && checkCol < column) {
                if (arr[checkRow][checkCol] != temp) {
                    return false;
                }
                checkRow++;
                checkCol++;
            }
            colIndex++;

            checkRow = 0;
            checkCol = colIndex;
        }

//        bottom left triangle
        checkRow = rowIndex;
        checkCol = 0;
        while (rowIndex < row) {
            temp = arr[rowIndex][0];
            checkRow++;
            checkCol++;

            while (checkRow < row && checkCol < column) {
                if (arr[checkRow][checkCol] != temp) {
                    return false;
                }
                checkRow++;
                checkCol++;
            }
            rowIndex++;

            checkRow = rowIndex;
            checkCol = 0;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;

        System.out.println("Enter the Row : ");
        row = scanner.nextInt();

        System.out.println("Enter the Column : ");
        column = scanner.nextInt();

        int[][] input = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        System.out.println(isToeplitz(input, row, column));
    }
}
