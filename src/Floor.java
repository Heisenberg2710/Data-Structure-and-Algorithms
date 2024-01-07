public class Floor {

    // Find the greatest number smaller or equal to the target

    public static int Floor(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid-1];
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={2,5,6,7,9,15};
        System.out.println(Floor(arr,17));
    }

}
