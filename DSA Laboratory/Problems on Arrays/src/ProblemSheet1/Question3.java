package ProblemSheet1;/*
    A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
    For example, if 2 left rotations are performed on array [1,2,3,4,5] , then the array would become [3,4,5,1,2].
    Given an array of n integers and a number d , perform d left rotations on the array.
    Then print the updated array.
*/

import java.util.Arrays;

public class Question3 {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int noOfRotation) {
        int arrLength = arr.length;

//        To handle case when noOfRotation >= arrLength
        noOfRotation = noOfRotation % arrLength;

//        Reverse the first noOfRotation elements
        reverse(arr, 0, noOfRotation - 1);

//        Reverse the remaining elements
        reverse(arr, noOfRotation, arrLength - 1);

//        Reverse Whole Array
        reverse(arr, 0, arrLength - 1);
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7};
        int noOfRotation = 2;

        leftRotate(input1, noOfRotation);
        System.out.println(Arrays.toString(input1));

        int[] input2 = {3, 4, 5};
        noOfRotation = 4;

        leftRotate(input2, noOfRotation);
        System.out.println(Arrays.toString(input2));

        int[] input3 = {4, 2, 6, 3, 5, 7};
        noOfRotation = 7;

        leftRotate(input3, noOfRotation);
        System.out.println(Arrays.toString(input3));
    }
}
