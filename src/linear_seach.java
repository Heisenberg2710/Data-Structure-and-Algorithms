
//Linear Search Examples


import java.util.Arrays;

// Finding element in the range of 1-4
public class linear_seach {
    public static void main(String[] args) {

        int[] array={2,8,7,1,6};

        int [][] array2D={
                {19,49,79,94,27,5},
                {47,61,23,42,11,22},
                {25,87,34,56,98,13}
        };

        int[][] acc={
            {12,17,3},
            {78,22,21},
                {0,13,45}

        };

        System.out.println("Richest customer has "+find_richest_customer(acc)+"$");

//        System.out.println(search(array));
//        System.out.println(min_num(array));
//          System.out.println(max_num(array));


        int[] even_digits={580,317,640,957,718,764};
//        System.out.println(findNumbers(even_digits));


//        System.out.println("Minimum in 2D Array: "+searchMinIn2D(array2D));

        int[] val=search2DArray(array2D,11);
//        System.out.println(Arrays.toString(val));
    }

    public static int search(int[] arr){
            if(arr.length==0){
                return -1;
            }
            for(int i=1;i<5;i++){
                int target=3;

                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
    }


//Find minimum number in the range

    public static int min_num(int[] arr){
        int min=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                 min=arr[i];
             }
         }
         return min;
    }

//    Find maximum number in the range

    public static int max_num(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }



//    Searching a random 2D Array


    public static int[] search2DArray(int[][] arr,int target){
            for (int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++){
                    if(arr[row][col]==target){
                        return new int[]{row,col};
                    }
                }
            }
        return new int[-1];
    }

// Searching min in 2D Arrays

   public static int searchMinIn2D(int[][] arr){
        int min=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
   }


    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int no_of_digits=0;
            String no_length=Integer.toString(nums[i]);
            int length_of_no=no_length.length();
            if(length_of_no%2==0){
                count++;
            }

        }
        return count;
    }

//    Leetcode example 2 (1672)


    public static int find_richest_customer(int [][] accounts){
         int max_value=Integer.MIN_VALUE;
         int[] customer_wealth =new int[accounts.length];


          for(int cust=0;cust<accounts.length;cust++){

              int sum=0;
              for(int bank=0;bank<accounts[cust].length;bank++){
                  sum+=accounts[cust][bank];
              }
             customer_wealth[cust]=sum;
          }



          for(int i=0;i<customer_wealth.length;i++){
                if(customer_wealth[i]>max_value){
                    max_value=customer_wealth[i];
                }
          }

          return max_value;
    }


}

