
public class FibocciNumberPerfect {

    public static void main(String[] args) {
        int n=6;
        if (fibonum(n)) {
            System.out.println(" is the fibo number:" + n);
        } else {
            System.out.println("not fibo number:" + n);
        }
    }

    public static boolean fibonum(int x) {
        int x1 = 5 * x * x + 4;
        int x2 = 5 * x * x - 4;
        return isPerfectsquare(x1) || isPerfectsquare(x2);
    }

    public static boolean isPerfectsquare(int x){ 
        int i = 1;
        while (i * i <= x) {
            if (i * i == x) {
                return true;
            }
            i++;
        }
        return false;
    }

}
