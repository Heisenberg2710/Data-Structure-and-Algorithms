// Sorted matrix

import java.util.Arrays;

public class SortedMatrix {


    public static void main(String[] args){
        int[][] myArr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        for(int[] row: myArr) {
            System.out.println(Arrays.toString(row));
        }

//         performing  binary search in sorted 2D array
        System.out.println(Arrays.toString(search(myArr,11)));

    }


    // lets first write the code for sorting finding the rows

    public static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int column=matrix[0].length;

        if(rows==1){
            binarySearch(matrix,0,0,matrix.length-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int colMid=column/2;


        while(rStart<(rEnd-1)){
            int rmid=rStart+(rEnd-rStart)/2;

            if(matrix[rmid][colMid]==target){
                return new int[] {rmid,colMid};
            }else if(matrix[rmid][colMid]<target){
                rStart=rmid;
            }else{
                rEnd=rmid;
            }

        }
//         consider the conditions

//        case 1: if the target element is the middle column itself

        if(matrix[rStart][colMid]==target){
            return new int[] {rStart,colMid};
        }
        if(matrix[rStart+1][colMid]==target){
            return new int[] {rStart+1,colMid};
        }

//         search in first half

        if(target<=matrix[rStart][colMid-1]){
           return binarySearch(matrix,rStart,0,colMid-1,target);
        }
//        search in second half
        else if(target<=matrix[rStart+1][colMid-1]){
            return binarySearch(matrix,rStart+1,0,colMid-1,target);
        }
//        search in third half

        else if(target>=matrix[rStart][colMid+1]){
            return binarySearch(matrix,rStart,colMid+1,matrix[0].length-1,target);
        }
//        search in fourth half

        else {
            return binarySearch(matrix,rStart+1,colMid+1,matrix[1].length-1,target);
        }

    }


//    Binary Search Algorithm for searching in a row

    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        int mid = cStart + (cEnd - cStart) / 2;

        while (cStart <= cEnd) {
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }




}
