package ProblemSheet3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows and cols : ");
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int topLeft = arr[0][0];
        int bottomLeft = arr[rows - 1][0];
        int topRight = arr[0][cols - 1];
        int bottomRight = arr[rows - 1][cols - 1];

        System.out.println(topLeft + bottomLeft + topRight + bottomRight);
    }
}
