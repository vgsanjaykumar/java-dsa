public class largest {
    public static void main(String[] args){
        
        int a[]={12,15,20,60,21,50};
        int max =a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
   
            }
           
        }
        System.out.println("largest number:"+max);
    }
}
