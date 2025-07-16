
import java.util.Scanner;

class array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*  System.out.println("enter the size of array");
        int a= scan.nextInt();
        int[] number = new int[a];
        for (int i=0;i<a;i++)
        {
            number[i]=scan.nextInt();
            
           
        }
        for (int i = 0; i < a; i++) {
            System.out.println("array lenght" +number[i]);
        }
         


         //2 table using for loop
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++) {

            System.out.println(i+"x2=" + i * 2);

         */
            
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

}
