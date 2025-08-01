
public class LcmGcd {
    public static void main(String[] args) {
        int a=20,b=20;
        int originala=a;
        int originalb=b;

        while(b!=0){
            int temp=b;
            b = a % b;
            a=temp;
        }
        int lcm=originala*originalb/a;
        System.out.println("lcm: "+lcm);
        System.out.println("gcd : is "+a);
    }
    
}
