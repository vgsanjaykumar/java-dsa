
public class Anagram {

    public static void main(String[] args) {
        String s1 = "bat";
        String s2 = "aab";
        int count = 0;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        if (a1.length == a2.length) {
            for (int i = 0; i < a2.length; i++) {
                char ch = a2[i];
                for (int j = 0; j < a1.length; j++) {
                    if (ch == a1[j]) {
                        a1[j] = '*';
                        count++;
                        break;
                    }
                }
            }
            if (count == s2.length()) {
                System.out.println("anagram");
            } else {
                System.out.println("not anagram");
            }

        } else {
            System.out.println("not anagram");
        }

    }
}
