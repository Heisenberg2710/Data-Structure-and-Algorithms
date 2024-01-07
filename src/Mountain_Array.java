public class Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // this is the case when we are in the decreasing part of the array
                // here mid can also be the answer as we have to check the left too hence end!=mid-1
                end=mid;
            }else {
                // we are in asc part of array
                // we can directly proceed with mid+1 element
                start=mid+1;
            }

        }
        return start;
    }


    public static void main(String[] args){
        int [] sample={3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(sample));
    }


}
