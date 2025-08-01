
public class Factor {
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        int prime=0;
        System.out.print("factor of "+n+ " number is:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" " );
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("sum of factor is:"+sum);

        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n<=1){
            System.out.println("prime number shound be start (2):" + n + " not this number");
        }
        
    }
}
