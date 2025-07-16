public class luckynum {
    public static int converttolucky(int L, String n){
        int lucky=0;
        for(int i=0;i<L;i++){
            int index =i+1;
            int Ascii=(int) n.charAt(i);

            if(index %2==1 || Ascii %2==1){
                lucky+=(index*Ascii);
            }
            System.out.println(Ascii);

            
        }
        return lucky;
    }

    public static void main(String[] args) {
        int L=11;
        String n = "Hello world";
        System.out.println(converttolucky(L,n ));
    }
    
}
