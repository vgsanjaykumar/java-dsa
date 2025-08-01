public class Pall {
    public static void main(String[] args) {
        String s="mam";
        String rev="";
        boolean pall =false;
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        for(int j=0;j<=s.length()-1;j++){
            if(s.charAt(j)==rev.charAt(j)){
                pall = true;
                break;
            }
        }
        if(pall){
            System.out.println("is pallndrome");
        }else{
            System.out.println("not pall");
        }
        System.out.println(rev);
    }
}
