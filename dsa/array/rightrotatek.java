

import java.util.Arrays;
import java.util.Scanner;
// right Array rotate k element
public class rightrotatek {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            System.out.println(Arrays.toString(arr));
        }
    }
   public static void rotate(int[] arr,int k){
    int size=arr.length;
    k=k%size;
    reverse(arr,0,size-1);//reverse la print pantrathukku
    reverse(arr,0,k-1);//k element rotate pnatrathuku
    reverse(arr,k,size-1);//again k va print pantrathukku
   } 

   public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6,7,8,9};
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter k value");
       int k=scan.nextInt();
       
       rotate(arr,k);
       System.out.println(Arrays.toString(arr) +" ");
   }
}
