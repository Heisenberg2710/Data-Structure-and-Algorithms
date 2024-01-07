import java.util.Arrays;

//Cyclic Sort Example 2: Google
public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(findAllMissing(arr)));
    }

    public static int[] findAllMissing(int[] arr) {

        int i=0;
        int count=0;
        int[] missingNos;

        while(i<arr.length){
            //lets define the correct position first
            int correct=arr[i]-1;

            if(arr[i]!=arr[correct] ){
                swap(arr,i,correct);
            }else {
                i++;
            }

        }



        for (int j=0;j<arr.length;j++){

               if(j!=arr[j]-1){
//                   missingNos[count]=arr[j]+1;
                   count++;
               }

        }

        missingNos=new int[count];
        int temp=0;

        for (int k=0;k<arr.length;k++){
            if(k!=arr[k]-1){
                missingNos[temp]=k+1;
                temp++;
            }
        }

        return missingNos;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
