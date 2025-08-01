
public class Lcm {
    public static void lcm(int a,int b){
        int lcm=(a>b)?a:b;
        while (true) { 
            if(lcm%a==0&&lcm%b==0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM of :"+a+" and "+"LCM of"+b+" :"+lcm);
    }
    public static void main(String[] args) {
            int a=400,b=248;
            lcm(a,b);
    }
    }

