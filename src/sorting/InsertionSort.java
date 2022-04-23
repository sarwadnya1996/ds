package sorting;

import java.util.Arrays;

/**
 * time complexity -->O(n2)
 */

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key =arr[i];
            int j=i-1;
            while(j>=0 && key<=arr[j]){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{54,12,23,89,78})));

        //Arrays.toString(int[])  to print array instead of taking loop
    }
}
