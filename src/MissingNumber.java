
//Implementation of Cyclic Sort : Example 1

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={4,0,2,1};
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int i=0;
        while(i<arr.length ){
            int correct=arr[i];
           if(arr[i]<arr.length && arr[i]!=arr[correct]) {
               swap(arr, i, correct);
           }else {
               i++;
           }
        }


        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
