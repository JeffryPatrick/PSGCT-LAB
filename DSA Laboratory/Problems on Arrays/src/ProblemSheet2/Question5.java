package ProblemSheet2;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

    static int smallestElement(int[] arr, int size) {
        Arrays.sort(arr);
        return arr[size - 1];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }

        int k = s.nextInt();

        System.out.println(smallestElement(input, k));
    }
}
