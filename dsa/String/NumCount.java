
public class NumCount {

    public static void main(String[] args) {
        String s = "sanjay @kumar 1123456789 AB";
        String res = "";
        char[] s2 = s.toCharArray();
        for (int i = 0; i < s2.length; i++) {
            char ch=s2[i];
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
              
            }else{
                System.out.print(ch);
            }
        }
        // for (int i = 0; i <= s.length()-1 ; i++) {
        //     char ch=s.charAt(i);
        //     if (ch >= '0' && ch<='9') {
        //          System.out.print(ch);  
        //     }
        // }
        //     for(int i=0;i<=s.length()-1;i++){
        //         char ch=s.charAt(i);
        //         if(ch>='a'&&ch<='z'|| ch>='A'&& ch<='Z'){
        //             System.out.println(ch);
        //         }
        //     }
        //     System.out.println(s.replaceAll("[^a-zA-Z]", ""));
        //     System.out.println(s.replaceAll("[^0-9]",""));
        //     System.out.println(s.replaceAll("[//S a-zA-Z0-9]",""));
        }
    }
