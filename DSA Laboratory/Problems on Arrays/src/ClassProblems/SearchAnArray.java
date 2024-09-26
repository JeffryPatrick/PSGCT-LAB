package ClassProblems;

import java.util.Scanner;

public class SearchAnArray {

    static int linearSearch(int[] arr, int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int size, target;
        Scanner in = new Scanner(System.in);

        size = in.nextInt();
        int[] input1 = new int[size];

        for (int i = 0; i < size; i++) {
            input1[i] = in.nextInt();
        }

        target = in.nextInt();
        System.out.println(linearSearch(input1, target));
    }
}
