
public class Gcd {
    public static void main(String[] args) {
        int a=20,b=20;
        int gcd=1;
        int min=(a<b)?a:b;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0&&b%i==0){

                gcd=i;
            }
        }
        System.out.println(gcd);

        System.out.println("Euclien algorthim");

        int a1=20,b1=20;
        
        while(b1!=0){
            int temp=b1;
            b1=a1%b1;
            a1=temp;
        }
        System.out.println(a1+" :is the gcd");
    }
}
