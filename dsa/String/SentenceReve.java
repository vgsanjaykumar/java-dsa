import  java.util.Scanner;
public class SentenceReve {

    public static void reverse(String s, int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(s.charAt(i));
           
        }


    }

    public static void main(String[] args) {
        System.out.println("enter the sentence:");
        Scanner scan = new Scanner(System.in);

        String s=scan.nextLine();
       
        int end = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                reverse(s, i + 1, end);
                System.out.print(" ");
                end = i - 1;
            }

        }
        reverse(s, 0, end);
    }
}
