public class FirstLetterCap {
    public static void main(String[] args) {
        String s="sanjay kumar v form karaikudi";
        boolean capital=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                System.out.print(ch);
                capital=true;
            }else if(capital&&ch>='a'&&ch<='z'){
                char upper = (char)(ch-32);
                System.out.print(upper);
                capital = false;
            }else{
                System.out.print(ch);
                capital=false;
            }
        }
    }
}
