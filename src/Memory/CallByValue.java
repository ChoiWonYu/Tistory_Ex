package Memory;

public class CallByValue {
    public static void main(String[] args){
        int[] arr={1,2,3};
        callByValue(arr);
        for(int i:arr)System.out.println(i);
    }

    public static void callByValue(int[] arr){
        arr[0]=10;
    }
}
