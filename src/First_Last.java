import java.util.Arrays;

public class First_Last {

//    Find First and Last Position of Element in Sorted Array

    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=findStartIndex(nums,target,true);
        ans[1]=findStartIndex(nums,target,false);


        return ans;
    }

    public static int findStartIndex(int nums[],int target,boolean startIndex){
        int ans=-1;
        int left=0;
        int right=nums.length-1;

//        here we are finding the element for the first time and then later calculating the occurences

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else {
                //potential answer but this may have repeated occurences before and after and we are concerned with first n last
                ans=mid;

                if(startIndex){
                    right=left-1;
                }else{
                    left=mid+1;
                }

            }
        }

        return ans;
    }



    public static void main(String[] args){
        int[] sample={5,7,7,8,8,10};
        System.out.println(searchRange(sample,7));
    }


}

