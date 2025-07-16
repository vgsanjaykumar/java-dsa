
import java.util.Arrays;

public class reverse {
    public static void checkarray(int[] arr){
        int n=arr.length;
        int firstnum=0,secondnum=0;

        // int firstnum1=arr[n/2-1];
        // int secnum=arr[n-1];
        for(int i=0;i<n/2;i++){
            firstnum=arr[i];
        }
        for(int j=n/2;j<n;j++){
            secondnum=arr[j];
        }
        if(firstnum<secondnum){
            reversearray(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reversearray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("reverse array is:+"+Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 50, 40, 60,70};
        checkarray(arr);
    }

}
