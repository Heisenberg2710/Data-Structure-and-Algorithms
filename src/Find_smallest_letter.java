import java.lang.reflect.Array;

public class Find_smallest_letter {

    public static char nextGreatestCharacter(char[] letters,char target){

        int left = 0;
        int right = letters.length - 1;
        char result = letters[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                result = letters[mid];
                right = mid - 1;
            }
        }

        return result;

    }

    public static void main(String[] args){

        char arr[]={'c','f','j','k','l'};

//        char start=arr[0];
//        char end=arr[arr.length-1];
//
//        char mid=(char) (start+(end-start)/2);

//        char mid1=(char) arr[Character.(mid)];
//        System.out.println(arr[]);

        System.out.println(nextGreatestCharacter(arr,'j'));
    }


}
