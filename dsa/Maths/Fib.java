
public class Fib {
    public static int fibo(int a){
        if(a<=1) {
            return a;
        }
      
        return fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args) {
        int a=7;
        System.out.println(fibo(a));
        for(int i=0;i<=a;i++){
            System.out.println(fibo(i));
        }
       
    }
}
