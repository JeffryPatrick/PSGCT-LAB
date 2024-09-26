package ProblemSheet1;/*
    Given an array arr[] of n elements, write a program to search a given element x in arr[].
    Example:
        Input : arr[] = 10, 20, 80, 30, 60, 50, 110, 100, 130, 170
	    x = 110
	    Output : Element 110 is present at index 6
        x = 200
	    Output : Element 200 is not present in the array
*/

public class Question1 {
    static void search(int[] arr, int target) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            if (target == arr[i]) {
                System.out.println("Element " + target + " is present at index " + i);
                return;
            }
        }

        System.out.println("Element " + target + " is not present in the array");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int target = 110;

        search(arr, target);

        target = 200;
        search(arr, target);

    }
}