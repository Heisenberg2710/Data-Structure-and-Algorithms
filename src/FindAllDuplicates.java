
//Cyclic Sort Example 4:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllDuplicates {


    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(findDuplicates(nums));
//        System.out.println(Arrays.toString(findDuplicates(nums));
// 1,2,3,4,2,3,7,8

    }

    public static List<Integer> findDuplicates(int[] nums){
        int i=0;
        List<Integer> missingNos=new ArrayList<>();
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
                missingNos.add(nums[j]);
            }
        }
        Collections.reverse(missingNos);

       return missingNos;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
