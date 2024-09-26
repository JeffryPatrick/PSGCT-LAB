package ProblemSheet1;/*
    Consider an array [a0, a1,a2,… an-1] of size n where n is an even number.
    An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
*/


public class Question4 {
    public static void balanceArray(int[] arr) {
        int length = arr.length;
        int sum1 = 0, sum2 = 0;
        int mid = length / 2;

        for (int i = 0; i < length; i++) {
            if (i < mid) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        if (sum1 == sum2) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(sum1 - sum2));
        }
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 5, 2, 4, 2};
        balanceArray(input1);

        int[] input2 = {1, 2, 1, 2, 1, 3};
        balanceArray(input2);
    }
}
