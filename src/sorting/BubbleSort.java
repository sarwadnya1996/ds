package sorting;

import java.util.Arrays;

/**
 * compare one element with all other elements in array
 * Time complexity->O(n2)
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]) {    //for  descending  if(arr[i]>arr[j) can be used for ascending sorting
                    int temp = arr[i];  //logic to swap the values
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{54,12,23,89,78})));

        //Arrays.toString(int[])  to print array instead of taking loop
    }
}
