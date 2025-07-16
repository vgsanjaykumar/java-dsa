
import java.util.Scanner;

/* return keyword using shop oru kadaiku pore oru teapowder vanguren athu oota price 15 rupes na athuku 20 rupes kudutha enaku chages tharuvagha balance 5 this is procrss
public class store{
    Scanner scan = new Scanner(System.in);

    int shop(){
        int teapower=15;
        int money = scan.nextInt();
        int remander = money-teapower;
        return remander;
    }
    public static void main(String[] args) {
        store obj = new store();
        int rem =obj.shop();
        
        
        System.out.print(rem);
    }
}
 */
public class store {

    Scanner scan = new Scanner(System.in);

    String getname(String a) {
        String b = a;
        return b;
    }

    int getnumber() {
        System.out.println("enter your phone number");
        int num = scan.nextInt();
        return num;
    }

    public static void main(String[] args) {
        store obj = new store();
        String name = obj.getname("sanjay");
        System.out.println(name);

        int number = obj.getnumber();
        System.out.println(number);
    }
}
