public class binary_search {



    public static void main(String[] args){
        int[] array={10,20,30,50,70};
        int target=30;
        int output=binary_search(array,target);
        System.out.println(output);

    }


    public static int binary_search(int[] arr, int target) {
//
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start <= end) {
//            int mid = start +  (end - start) / 2;
//            if (arr[mid] > target) {
//                end = mid-1;
//            } else if (arr[mid] < target) {
//                start = mid+1;
//            } else if (arr[mid] == target) {
//                return mid;
//
//            }
//        }
//        return -1;

//        Method for binary Search
        int start=0;
        int end=arr.length-1;

        while(start<=end){
//            finding the middle element

            int mid=start+(end-start)/2;

            if(target<arr[mid-1]){
                end=mid-1;
            }else if(target>arr[mid+1]){
                start=mid+1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
         return -1;
    }
}