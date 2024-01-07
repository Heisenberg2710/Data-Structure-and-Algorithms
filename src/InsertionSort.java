// in insertion sort after the element at consideration gets sorted with reference to it LHS
//swaps are reduced if array is sorted
// no of swaps reduced compared to bubble sort
//used for smaller values of n
//works for smaller values of n => works good when array is partially sorted

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
       int [] arr={5,3,4,1,2};
       insertion(arr);
       System.out.println(Arrays.toString(arr));

    }

    public static void insertion(int[] arr) {

        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
//                    we dont need to track behind the previous element of i as Left hand side is getting sorted autoatically
                }
            }
        }

    }


    static void swap(int[] arr,int first, int second) {

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;



    }


}
