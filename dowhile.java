import java.util.Scanner;
class dowhile{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=0;
        do { 
            System.out.println("enter a number greter than 10 ");
             a =scan.nextInt();

        } while (a<=10);
    }
}