
// 2 point approach method for binary search when order is descending

import java.util.Arrays;

public class TwoSum {
//                    ,target: 38

        public int[] twoSum(int[] numbers, int target) {
                int a_pointer=0;
                int b_pointer=numbers.length-1;

                while(a_pointer<=b_pointer){
                    int sum=numbers[a_pointer]+numbers[b_pointer];

                    if(sum>target){
                        a_pointer+=1;
                    }else if(sum==target){
                        return new int[] {a_pointer+1,b_pointer+1};
                    }else {
                        b_pointer-=1;
                    }
                }

                return new int[] {a_pointer+1,b_pointer+1};
        }


        public static void main(String[] args){

            int[] number_arr={45,32,27,11,6,2};
            TwoSum sample=new TwoSum();

            System.out.println(Arrays.toString(sample.twoSum(number_arr,38)));

        }

}
