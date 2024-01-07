//Cyclic Sort Example

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,3,6,2,3,4};
        System.out.println(Arrays.toString(findSetMismatch(arr)));
    }

    //1,3,6,2,3,4 => 1,2,3,3,4,6

    public static int[] findSetMismatch(int[] arr) {
        int i=0;
        int[] result=new int[2];
        while(i<arr.length){
            int correct=arr[i]-1;

            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        for (int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                result[0]=arr[j];
                result[1]=j+1;
            }
        }

        return result;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
