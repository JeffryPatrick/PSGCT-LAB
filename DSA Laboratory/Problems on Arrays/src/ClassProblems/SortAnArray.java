package ClassProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

    static void bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        size = in.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }

        bubbleSort(input, size);
    }
}
