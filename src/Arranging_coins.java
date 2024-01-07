public class Arranging_coins {

    public static int arrangingCoins(int n){
        long start=1;
        long end=n;

        while(start<=end){
            long mid=start+(end-start)/2;

            if(n>=(mid*(mid+1))/2){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int)end;

    }

    public static void main(String[] args){
        System.out.println(arrangingCoins(30));

    }



}
