public class UnwantedSpace {
    public static void main(String[] args) {
        String s="  Sanjay     Kumar    v   ";
        boolean space=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                System.out.print(ch);
                space=true;
            }else if (space==true) {
                System.out.print(' ');
                space=false;
            }
        }
    }
}
