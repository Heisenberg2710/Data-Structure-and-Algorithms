public class Valid_Perfect_Square {

//    let us take 16 as an example...1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
    public boolean Valid_Perfect_Square(int num){
        int start=1;
        int end=num;

        while(start<=end){
            int mid=start+(end-start)/2;


            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Valid_Perfect_Square vps=new Valid_Perfect_Square();
        System.out.println(vps.Valid_Perfect_Square(101));
    }
}
