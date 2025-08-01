public class IndexCount {
    public static void main(String[] args) {
        String s="sanjay";
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            System.out.println(ch+" "+s.indexOf(ch));
        }
    }
}
