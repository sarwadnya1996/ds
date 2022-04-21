package searching;

/**
 * Time complexity-->O(n)
 */
public class LinearSearch {
    public static int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] inputArr=new int[]{10,34,67,97,1};
        System.out.println(search(inputArr,97));
    }
}
