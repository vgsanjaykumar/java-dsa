
public class Pattern {

    public static void main(String args[]) {
        char a='{' ,b='}';
        int count=4;
        for(int i=1;i<=count;i++){
            for(int m=1;m<=i;m++){
                for (int j = 1; j <= m; j++) {
                    System.out.print(a);
                }
                for (int k = 1; k <= m; k++) {
                    System.out.print(b);
                }
            }
    
            System.out.println(" ");
        }

    }
}
