
public class selection {
    public static void main(String[] args) {
        int[]arr={17,16,1,1,5,2,4,10};
        int midelemnt =0;
        for (int i=0;i<=arr.length-1;i++){
            midelemnt=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[midelemnt]>arr[j]){
                    midelemnt=j;
                }
            }
           
                int temp=arr[i];
                arr[i]=arr[midelemnt];
                arr[midelemnt]=temp;
            
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
      
    }
    
    }
  