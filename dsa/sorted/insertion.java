public class insertion {
   public static void main(String[] args) {
       int []a={0,12,1,15,14,15,15,2,1,2,3,4,5,6,7,7};
       for(int i=1;i<a.length;i++){
      // for lopp
        // for(int j=i;j>0 && a[j-1]>a[j];j--){
        //     int temp=a[j-1];
        //     a[j-1]=a[j];
        //     a[j]=temp;

        // }
        //while loop
        int j=i;
        while(j>0&&a[j-1]>a[j]){
            int t=a[j];
            a[j]=a[j-1];
            a[j-1]=t;
            j--;
        }
       
           
           
        
       }
       for(int num:a){
        System.out.print(num +" ");
       }
   }
}
