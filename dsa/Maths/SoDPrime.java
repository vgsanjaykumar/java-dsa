import java.util.Scanner;
public class SoDPrime {
    public static void main(String[] args) {
       System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("sum of digit:"+sum);
        prime(sum);
    }
    public static void prime(int a){
        boolean isprime=true;
        if(a<=1){
           isprime=false;
        }
        for(int i=2;i<=a;i++){
            if(a%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("prime number");
        }else{
            System.out.println("Not the Prime number");
        }
    }
    
}
