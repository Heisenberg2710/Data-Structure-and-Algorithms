import java.util.Arrays;

// when given nos from 1 to n ///****remember to use cyclic sort // no point in considering case when 0 is included in array
public class CyclicSort {



    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {


       int i=0;

       while(i<arr.length){
           int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
       }


    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
