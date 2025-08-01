
import java.util.Scanner;

public class UppercaseAscii {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("enter the string to covert upper case: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upper = (char) (ch - 32);
                System.out.print(upper);
            } else {
                System.out.print(ch);
            }

            //IF YOU WANT LOWERCASE:

        }
        System.out.println();
        System.out.println("in lower case: ");
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            if (ch >= 'A' && ch <= 'Z') {
                char lower = (char) (ch - 32);
                System.out.print(lower);
            } else {
                System.out.print(ch);
            }

        }
    }
}
