
public class ReverseNum {
    public static void main(String[] args) {
        int n=121214;
        int temp=n;
        int rev=0;
        while(n!=0){
           int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println(rev+" is reverse number");
        if(rev==temp){
            System.out.println(rev+" is the pallndrome");
        }else{
            System.out.println(rev+" is not pallndrome");
        }
    }
    
}
