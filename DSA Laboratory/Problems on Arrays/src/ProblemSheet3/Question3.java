package ProblemSheet3;

import java.util.Scanner;

public class Question3 {

    public static int[] reverse(int[] arr, int start, int end) {
        end = end - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void rotate90Deg(int[][] arr, int rows, int cols) {
//        transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            arr[i] = reverse(arr[i], 0, cols);
        }

//        print 90deg array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

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

        System.out.println("Original Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("90 Deg Rotation");
        rotate90Deg(arr, rows, cols);
    }
}
