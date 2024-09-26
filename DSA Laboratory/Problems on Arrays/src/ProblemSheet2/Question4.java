package ProblemSheet2;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

    static void rotateLeft(int[] arr, int size) {

        int start = 0, end = size - 2, temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        start = 0;
        end = size - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }

        rotateLeft(input, size);
    }
}
