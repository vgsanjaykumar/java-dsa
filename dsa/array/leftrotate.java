
import java.util.Arrays;

public class leftrotate {
    public static int leftrotate(int[] arr){
        int size=arr.length;
        int temp=arr[0];
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=temp;
        System.out.println(Arrays.toString(arr)+" ");
        return 0;
    }

    public static void main(String[] args) {
        int [] arr={0,10,20,30,40,50};
        leftrotate(arr);
    }
}
