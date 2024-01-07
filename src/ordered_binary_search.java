//order agnostic binary search refers to the cases when the arrya is not sorted in any particular order (asc or desc)
//Order-Agnostic Binary Search is a modified version of Binary Search algorithm. Here in this modified binary search comes with one more condition checking.
// The intuition behind this algorithm is what if the order of the sorted array is not given.

public class ordered_binary_search {

    public static void main(String[] args) {
        int arr[]={99,80,77,22,11,10};
        int arr1[]={10,30,40,50,60};
        int ans=ordered_binary_search(arr,11);
        int ans1=ordered_binary_search(arr1,40);
        System.out.println(ans);
        System.out.println(ans1);


    }


    public static int ordered_binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsec=arr[start] < arr[end];



             while (start<=end){
                int mid = start + (end - start) / 2;


                if(arr[mid]==target){
                    return mid;
                }

                if (isAsec){
                    if(target<arr[mid-1]){
                        end=mid-1;
                    }else if (target>arr[mid-1]){
                        start=mid+1;
                    }

                }else {
                    if(target>arr[mid-1]){
                        end=mid-1;
                    }else if (target<arr[mid-1]){
                        start=mid+1;
                    }
                }
             }

        return -1;
    }
}