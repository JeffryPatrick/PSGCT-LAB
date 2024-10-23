package ProblemSheet3;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rows and cols : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int countZeroElements = 0;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 0) {
                    countZeroElements += 1;
                }
            }
        }

        if (countZeroElements >= ((rows * cols) / 2)) {
            System.out.println("The given matrix is Sparse Matrix");
        } else {
            System.out.println("The given matrix is not a Sparse Matrix");
        }
    }
}
