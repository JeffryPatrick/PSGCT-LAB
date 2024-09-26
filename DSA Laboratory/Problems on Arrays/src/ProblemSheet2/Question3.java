package ProblemSheet2;

import java.util.Scanner;

public class Question3 {

    static int largestSum(int[] arr, int size) {
        int tempSum, maxSum = 0;
        if(size == 0) {
            return -1;
        }
        if(size == 1) {
            return arr[0];
        }
        for(int i = 0; i < size; i++) {
            tempSum = arr[i];
            for(int j = i + 1; j < size; j++) {
                tempSum += arr[j];
                if(tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size;
        size = in.nextInt();

        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = in.nextInt();
        }

        int result = largestSum(input, size);
        System.out.println(result);
    }
}
