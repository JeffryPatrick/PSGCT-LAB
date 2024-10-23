package ProblemSheet3;

import java.util.Scanner;

public class Question5 {
    public static void spiralMatrix(int[][] arr, int rows, int cols) {
        int top, left, right, bottom;

        top = left = 0;
        right = cols - 1;
        bottom = rows - 1;

//      loop until all elements are not traversed
        while (top <= bottom && left <= right) {

//            For moving left to right
            for (int i = left; i <= right; i++)
                System.out.println(arr[top][i]);
            top++;

//            For moving top to bottom
            for (int i = top; i <= bottom; i++)
                System.out.println(arr[i][right]);
            right--;

//            For moving right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.println(arr[bottom][i]);
                bottom--;
            }

//          For moving bottom to top
            if(left <= right) {
                for(int i = bottom; i >= top; i--)
                    System.out.println(arr[i][left]);
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr;
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        arr = new int[rows][cols];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        spiralMatrix(arr, rows, cols);
    }
}
