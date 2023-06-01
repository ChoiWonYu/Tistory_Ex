package Memory;

public class CallBySharing {
    public static void main(String[] args){
        int[] arr={1,2,3};
        callBySharing(arr);
        for(int i:arr)System.out.println(i);
    }

    public static void callBySharing(int[] arr){
        arr[0]=10;
        arr=new int[] {3,2,1};
        arr[0]=10;
    }
}
