public class Contains {
    public static void main(String[] args) {
        String s1=" bat are flyig ";
        String s2="tab are y=using ";
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                        i++;
                    }
                }
                if(count==s2.length()){
                    System.out.println("string are contain");
                }else{
                    System.out.println("not contain");
                }
            }
        }
    }
}
