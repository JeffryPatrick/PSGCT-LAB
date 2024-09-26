package ProblemSheet1;/*
    Given an array of integers, find the sum of its elements.
    Example: arr[] = {1, 2, 3}; => 1 + 2 + 3 = 6
*/

public class Question5 {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        System.out.println(sumArray(input1));

        int[] input2 = {1, 2, 3, 4, 10, 11};
        System.out.println(sumArray(input2));
    }
}
