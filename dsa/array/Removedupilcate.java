
import java.util.Arrays;


public class Removedupilcate {

    public static void sort(int[] arr){
        int size=arr.length;
        System.out.print("original array is:" + Arrays.toString(arr));
       for(int i=0;i<size-1;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
       }
        System.out.print("sorted arrary" + Arrays.toString(arr));
    }

    public static int removedupilicate(int[] arr) {
        int i = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,40,1,1,2,2,3,3,4,4,5,5};
        sort(arr);
        removedupilicate(arr);
    }
}
