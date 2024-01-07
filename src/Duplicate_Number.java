import java.util.Arrays;

// Cyclic Sort Example 3:
public class Duplicate_Number {


    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
//        System.out.println(Arrays.toString(nums));

    }

    public static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
               if(j!=nums[j]-1){
                   return nums[j];
               }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
