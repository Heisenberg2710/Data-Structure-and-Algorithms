import java.util.Arrays;

//Cyclic Sort Example
//hard level : return first missing positive number
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
//        System.out.println(firstMissingPositive(arr));
        System.out.println((firstMissingPositive(arr)));

    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if(arr[i]> arr.length){
                continue;
            }

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] && arr[i] > 0 && arr[i] <= arr.length) {
                swap(arr, i, correct);
            } else {
                i++;
            }

            for (int j = 0; j < arr.length; j++) {
                if  (arr[j] != j + 1) {
                    return j + 1;
                }
            }
        }
        return arr.length+1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


}