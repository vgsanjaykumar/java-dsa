public class bubble{
    public static void main(String[] args) {
        int []a={1,2,3,4};
        boolean flag=false;
        
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
               }      
            }
            if(flag==false){
                System.out.println("already sorted");
                break;
            }
          
        }
        for (int num : a) {
            System.out.println(num);
        }
       
        
    }}
