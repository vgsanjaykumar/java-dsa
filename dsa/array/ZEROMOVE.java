import java.util.Arrays;

public class ZEROMOVE {
    public static void main(String[] args) {
        int i=0,z=1;
        int []arr={0,1,2,0,3,5,0};
        int size=arr.length;
        while(z<size)
        {
            if(arr[i]==0)
            {
                if(arr[z]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[z];
                    arr[z]=temp;
                    i++;
                    z++;
                    
                }else
                {
                    z++;
                }
            }else
            {
                i++;
                z++;
            }
        }
        System.out.println(Arrays.toString(arr)+" " );
      
        int [] arr1 = new int[arr.length];
        for(int j=0;j<arr.length;j++){
            arr1[j]=arr[j];
            System.out.print(arr1[j]+" ");

        }
        
       
    }
}
