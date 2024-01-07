public class Celing_question {

//    Find the element or the next greatest element for a given sorted array
    //also called ceiling of a number


    public static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }

        }
       return arr[end+1];
    }


    public static void main(String[] args){
        int [] sample={1,4,7,9,12,15};
        System.out.println(ceiling(sample,7));
    }



}
