import java.util.Scanner;
class equal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if (num1==num2){
            System.out.println("num1 is equal");
        }
        else{
            System.out.println("num 2 is not equal");
        }
    }
}