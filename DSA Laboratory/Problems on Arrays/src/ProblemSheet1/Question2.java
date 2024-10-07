package ProblemSheet1;/*
*   Write a program to find the maximum and minimum element in an array.
*/

public class Question2 {
    static void minMax(int[] arr) {
        int arrLength = arr.length;
        if(arrLength == 0) {
            return;
        }
        int min = arr[0], max = arr[0];
        for(int i = 1; i < arrLength; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6};
        minMax(arr);
    }
}