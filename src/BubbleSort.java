
//Bubble Sorting Algorithm

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("OG Array: "+Arrays.toString(arr));

        System.out.println("Bubble Sorted Array: "+Arrays.toString(bubble(arr)));
    }

//    assume we want to bubble sort in ascending order

    public static int[] bubble(int [] arr){
        boolean swapped=false;
        for (int i = 0; i <arr.length ; i++) {
            // the element on the last index would be the largest number
            // one swap is one iteration across the i counter
            for (int j=1;j< arr.length-i;j++){
                // the swap will occur
                if(arr[j]<arr[j-1]) {
                    swapped=true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

            if(swapped!=true){
                break;
            }

        }
        return arr;
    }

}
