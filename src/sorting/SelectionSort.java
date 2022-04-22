package sorting;

import java.util.Arrays;

/**
 *time complexity O(n2)
 * space complexity is O(1) as temp variable is used
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{54, 12, 23, 89, 78, 2})));
        //Arrays.toString(int[])  to print array instead of taking loop
    }
}
