public class binary {
    public static void main(String[] args) {
        int[] num={12,23,25,44,65,74,88,89,96};

        int target=44;
        System.out.println(bin(num,target ));
    }
    static int bin(int[] num,int target){

        int start=0;

        int end=num.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;

            if(target< num[mid]){
                end =mid-1;
            } else if (target>num[mid]) {
                start =mid+1;
            }else {
                return mid;
            }

        }
     return -1;
    }
}
