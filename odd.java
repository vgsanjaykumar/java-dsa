import java.util.Scanner;
//odd or even
class odd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a % 2==1)
        {
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }

//divisible by 3
        int b=scan.nextInt();
        if (b%3==0)
        {
           System.out.println("divisible by 3");
        }
        else
        {
            System.out.println("not divisible by 3");
        }



        //divisible by two number 5 and 3

        int c = scan.nextInt();
        if (c % 3 == 0 && c%5==0) {
            System.out.println("divisible by 3 and 5");
        } else {
            System.out.println("not divisible by 3 and 5");
        }

    }
}