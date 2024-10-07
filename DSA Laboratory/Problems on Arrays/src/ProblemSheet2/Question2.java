package ProblemSheet2;

import java.util.Arrays;

public class Question2 {

    public static int medianOfTwoSortedArrays(int[] list1, int[] list2) {

        int m = list1.length;
        int n = list2.length;

        int[] mergeArray = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (list1[i] < list2[j]) {
                mergeArray[k] = list1[i];
                i++;
            } else {
                mergeArray[k] = list2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mergeArray[k] = list1[i];
            i++;
            k++;
        }
        while (j < n) {
            mergeArray[k] = list2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(mergeArray));

        int totalLength = mergeArray.length;

        if (totalLength % 2 == 1) {
            return mergeArray[totalLength / 2];
        }

        return (mergeArray[totalLength / 2] + (mergeArray[totalLength / 2 - 1])) / 2;
    }

    public static void main(String[] args) {
        int[] list1 = {-5, 3, 6, 12, 15};
        int[] list2 = {-12, -10, -6, -3, 4, 10};

        int median = medianOfTwoSortedArrays(list1, list2);

        System.out.println(median);

        int[] list3 = {2, 3, 5, 8};
        int[] list4 = {10, 12, 14, 16, 18, 20};

        median = medianOfTwoSortedArrays(list3, list4);

        System.out.println(median);
    }
}
