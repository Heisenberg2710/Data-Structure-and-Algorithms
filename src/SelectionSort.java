//This is an example for selection sort algorithm which arranges all the elements in an unsorted array and arranges them element by element

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
          for (int i=0;i<arr.length;i++){
              int last= arr.length-i-1;
              int maxIndex=getMax(arr,0,last);
              swap(arr,last,maxIndex);

          }
        //              now as we iterate to next element, step by step the last element keeps on getting updated

    }

     static void swap(int[] arr,int first, int second) {

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;



    }

    static int getMax(int[] arr, int start, int end) {

        //assume last element is the max
        int max=start;

        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }

        return max;
    }





}
