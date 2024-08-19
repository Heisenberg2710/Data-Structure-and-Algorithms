package Strivers;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 2};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge method to combine two sorted halves into a single sorted array
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int leftIndex = low;
        int rightIndex = mid + 1;
        int mergeIndex = 0;

        // Merge the two halves into the merged array
        while (leftIndex <= mid && rightIndex <= high) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                merged[mergeIndex++] = arr[leftIndex++];
            } else {
                merged[mergeIndex++] = arr[rightIndex++];
            }
        }

        // Copy any remaining elements of the left half
        while (leftIndex <= mid) {
            merged[mergeIndex++] = arr[leftIndex++];
        }

        // Copy any remaining elements of the right half
        while (rightIndex <= high) {
            merged[mergeIndex++] = arr[rightIndex++];
        }

        // Copy the sorted elements back into the original array
        for (int i = 0,j=low; i < merged.length; i++,j++) {
                arr[j]=merged[i];
        }
    }

    // Recursive mergeSort method to divide and conquer the array
    public static void mergeSort(int[] arr, int low, int high) {
        // Base case: if the array has one or no elements, it's already sorted
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Recursively sort the left half
        mergeSort(arr, low, mid);
        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);
        // Merge the sorted halves
        merge(arr, low, mid, high);
    }
}


// pseudo code

 /*
        // first divide and conquer left and right halves nd then merge the individual sorts

        mergeSort(arr[],low,high){

           if(low>=high)
              return;


           int mid=low+(high-low)/2;

           mergeSort(arr,low,mid);

           mergeSort(arr,mid+1,high);

           merge(arr,low,mid,high);

        }

        // now sort the halfs and merge them

        merge(arr[],low,mid,high){
            temp[];
            left=low;
            right=high;

            while(left<=mid and right<=high){

               if(arr[left]<=arr[right]){
                  temp.add(arr[left]);
                  left++;
               }else{
                  temp.add(arr[right]);
                  right++;
               }

               while(left<=mid){
                  temp.add(arr[left]);
                  left++;
               }

               while(right<=mid){
                  temp.add(arr[right]);
                  right++;
               }
                temp[i - low] is used to access the correct element from temp[] while copying it back to the original array arr[].
               for (int i=low to high){
                  arr[i]=temp[i-low];
               }


            }




        }

  */
