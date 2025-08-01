
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a input value:");
        int a = scan.nextInt();

        //right side pattern
        /*
       * *
       * **
       * ***
       * ****
       * *****
         */
        System.out.println("right side pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // square fill pattern
        /*
         * ****
         * ****
         * ****
         * ****
         */
        System.out.println("square pattern");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //reserver right side pattern
        /*
         * ****
         * ***
         * **
         * *
         */
        System.out.println("reserver string pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
        // number increasing pattern
        /* 
       1
       12
       123
       1234
         */
        System.out.println("number increase pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // number increase reverse pattern
        /*
         * 1234
         * 123
         * 12
         * 1
         */
        System.out.println(" number increase reverse pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //right pascal traingle
        /*
         * *
         * **
         * ***
         * ****
         * ***
         * **
         * *
         */
        //twohalf split pantrom
        //inner loop
        System.out.println("pascal tringle");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //outerloop
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //k pattern
        /*
         * ****
         * ***
         * **
         * *
         * **
         * ***
         * ****
         */
        System.out.println("k pattern 1");
        //inner loop
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop
        for (int i = 1; i < a; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("k pattern 2 with mathsabs");
        for (int i = 0; i <= a; i++) {
            //left la prtint aagurakku
            System.err.print("*");

            for (int j = 0; j <= a; j++) {
                if (j == Math.abs(a / 2 - i)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        // o and 1 traingle pattern
        // forumula using 2%2=0  value 0 irtha enaku 1 print aaganum !! 3%2==1 irutha 0 print aaganum
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         */
        // setup matri
        /*
         * 11
         * 21 22
         * 31 32 33
         * 41 42 43 44
         */
        System.out.println("0 and 1 using traingle");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        //square hallow pattern
        /*
            ******
            *    *
            *    *
            *    *
            *    *
            ******
         */
        System.out.println("square hallow pattern");

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (i == 0 || j == 0 || i == a || j == a) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //number right pattern
        /*
           1
           2 3
           4 5 6
           7 8 9 10
          
         */
        System.out.println("number inccrea pattern");
        int num = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("left side triangle");
        //     *
        //       **
        //      ***
        //     ****
        //    *****

        for (int i = 1; i <= a; i++) {
            //space peint
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            //peint stars***
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // same same using prymid ena pannum na star pakthula extra oru space
            }
            System.out.println();
        }

        System.out.println("revers left side triangle");

        // *****
        // ****
        //  ***
        //   **
        //    *
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= a - i + 1; k++) {
                System.out.print("*");  // same same using prymid ena pannum na star pakthula extra oru space
            }

            System.out.println();
        }

        // traingle or pymid
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        System.out.println("triangle");
        for (int i = 1; i <= a; i++) {
            //space
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("number traingle pattern ");
        //      1
        //     2 2
        //    3 3 3
        //   4 4 4 4
        //  5 5 5 5 5
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }

        // reverse number traingle

        /*
         *  1 2 3 4 5
             1 2 3 4
              1 2 3
               1 2
                1
         */
        System.out.println("number reverse traingle  ");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= a - i + 1; k++) {
                System.out.print(k + " ");

            }
            System.out.println();
        }

//using two loop
        for (int i = 1; i <= a; i++) {
            // Loop 1: Print spaces and numbers together
            for (int j = 1; j <= a; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print((j - i + 1) + " ");
                }
            }
            System.out.println();
        }

        // palindrome traingle pattern

       //           1
//         2 1 2
//       3 2 1 2 3
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5 
System.out.println("palindrome traingle pattern");
        for (int i = 1; i <= a; i++) {
            //space
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            //decrement
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            //increment
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
