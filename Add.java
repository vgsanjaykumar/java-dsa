
import java.util.Scanner;

public class Add{

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    
    void Addtion(){
    
        System.out.println(a + b);
       
      
     }
     void sub(){
         System.out.println(a-b);
     }
    
  
    public static void main(String[] args) {
      
        Add add1 = new Add();
        add1.Addtion();
        add1.sub();
        
    }

}