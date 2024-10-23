package ProblemSheet3;

import java.util.Scanner;

public class Question4 {

    public static int binarySearchInMatrix(int[][] matrix, int rows, int cols, int target) {
        int[] arr = new int[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i * cols + j] = matrix[i][j];
            }
        }

        for (int x : arr) {
            System.out.println(x);
        }
        int start = 0, end = rows * cols;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        int[][] arr;
        System.out.println("Enter the number of rows and columns : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        arr = new int[rows][cols];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        System.out.println(binarySearchInMatrix(arr, rows, cols, target));
    }
}
