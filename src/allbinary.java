public class allbinary {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,11,12,32,35,65};

        int target=1;
        System.out.println(bin(num,target));
    }
    static int bin(int[] num,int target){

        int start=0;

        int end=num.length-1;

        boolean isAcc=num[start]<num[end];

        while (start<=end){
            int mid =start+(end-start)/2;

            if (num[mid]==target){
                return target;
            }

            if (isAcc) {
                if(target< num[mid]){
                    end =mid-1;
                } else {
                    start =mid+1;
                }
            }
            else {
                if(target> num[mid]){
                    end =mid-1;
                } else {
                    start =mid+1;
                }
            }
        }
        return -1;
    }
}
