
public class AmyStrong {
    public static void main(String[] args) {
        int n=153;
      
        int temp=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(temp==sum){
            System.out.println("amystrong number:"+temp);
        }else{
            System.out.println("not amy strong number:"+sum);
        }
    }
}
