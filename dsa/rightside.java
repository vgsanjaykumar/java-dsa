
import java.util.Scanner;

public class rightside {
    // * i=1 
    // **
    // ***
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("enter a input value:");
        int a=Scan.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0; j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
