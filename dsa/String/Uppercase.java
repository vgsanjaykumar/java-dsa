
import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {
        //SaNjAY print pantrathukku
        // Scanner scan = new Scanner(System.in);
        // String input = scan.nextLine();
        // char[] ch = input.toCharArray();
        // for(int i=0;i<=ch.length-1;i++){
        //     if(ch[i]>='a'&&ch[i]<='z'){
        //         // ch[i]=(char) (ch[i]-32); //intha plce ellrm letter capitaal print aganum
        //         if(i%2==1){
        //             ch[i]=(char)(ch[i]-32); //intha place 1by2 capital letter print aaganum SaNjAY ipidi
        //         }
        //     }
        // }
        // String s = new String(ch);
        // System.out.println(s);

        //method 2
        System.out.println("with using substring method 2");
        String s1="sanjaykumar";
        for(int i=0;i<s1.length();i++){
            String ch=s1.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch.toLowerCase());
            }
        }
        
    }
}
