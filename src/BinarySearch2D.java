
//Binary search in 2D Arrays

import java.util.Arrays;

public class BinarySearch2D {


    public static int[] search(int[][] test,int target){
        int r=0;
        int c= test.length-1;

        while (r<test.length && r>=0){
            if(test[r][c] == target){
                return new int[]{r,c};
            }else if(test[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }


    public static void main(String[] args) {


                int[][] arr = {
                        {10,20,30,40},
                        {15,25,35,45}
                };



        System.out.println(Arrays.toString(search(arr,15)));

            }



        }





