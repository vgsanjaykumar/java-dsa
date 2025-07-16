
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string:");
        String input =scan.nextLine();
       
        char[] s=input.toCharArray();
        
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
