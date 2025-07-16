
import java.util.Arrays;




public class sorted {
    public static void main(String[] args) {
        int a[]={70,15,75,25,50};
        System.out.println("given arrary is :" +Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]<a[i-1]){
                System.out.println("soretd array:"+Arrays.toString(a));
            }
            
        }
        for(int num:a){
            System.out.println(" "+num);
        }
       
    }
}
