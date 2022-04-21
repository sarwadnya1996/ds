package searching;

/**
 * Time complexity-->O(logn)
 * It required input array to be sorted
 */
public class BinarySearch {
    public static int binarySearch(int[] arr,int start,int end,int key){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input=new int[]{10,20,30,40,50};
        System.out.println(binarySearch(input,0,input.length,40));
    }
}
