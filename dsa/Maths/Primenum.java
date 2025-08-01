
public class Primenum {

    public static void main(String[] args) {
       int n=1;
       boolean prime =true;
       if(n<=1){
        prime=false;
       }
       for(int i=2;i<=n/2;i++){
        if(n%i==0){
            prime= false;
            break;
        }
       }
       if(prime){
        System.out.println("prime :"+n);
       }else{
        System.out.println("not primr:"+n);
       }
    }
}
