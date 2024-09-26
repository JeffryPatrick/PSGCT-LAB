package ProblemSheet2;

public class Question1 {

    public static int longestIncreasingSubsequence(int[] arr) {
        int lenOfSubsequence, maxLenOfSubsequence = 0;
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            lenOfSubsequence = 1;
            int temp = arr[i];

            for (int j = i + 1; j < arrLength; j++) {
                if (temp < arr[j]) {
                    lenOfSubsequence += 1;
                    temp = arr[j];
                }
            }

            if (lenOfSubsequence > maxLenOfSubsequence) {
                maxLenOfSubsequence = lenOfSubsequence;
            }
        }
        return maxLenOfSubsequence;
    }

    public static void main(String[] args) {
        int[] input1 = {3, 10, 2, 1, 20};

        int[] input2 = {50, 3, 10, 7, 40, 80};

        int[] input3 = {30, 20, 10};

        int[] input4 = {10, 20, 35, 80};

        System.out.println(longestIncreasingSubsequence(input1));

        System.out.println(longestIncreasingSubsequence(input2));

        System.out.println(longestIncreasingSubsequence(input3));

        System.out.println(longestIncreasingSubsequence(input4));
    }
}
