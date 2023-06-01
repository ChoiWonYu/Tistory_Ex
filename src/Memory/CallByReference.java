package Memory;

public class CallByReference {
    public static void main(String[] args){
        int[] arr={1,2,3};
        callByReference(arr);
        for(int i:arr)System.out.println(i);
    }

    public static void callByReference(int[] arr){
        arr=new int[]{3,2,1};
    }
}
