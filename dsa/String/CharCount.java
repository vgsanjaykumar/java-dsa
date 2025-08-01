
public class CharCount {

    public static void main(String[] args) {
        String s = "kumar 1 a a";
        char First = s.charAt(0);
        System.out.println("First letter " + First);
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (First == s.charAt(i)) {
                count++;
            }

        }
        System.out.println("count is " + count);
     
    }
}


