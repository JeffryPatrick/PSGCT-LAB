package ClassProblems;

import java.util.Scanner;

public class MinMax {

    static void minMax(int[] arr, int size) {
        int min = arr[0], max = arr[0];

        for (int i = 1; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        size = in.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }

        minMax(input, size);
    }
}
