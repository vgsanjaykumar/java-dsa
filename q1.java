import java.util.Scanner;
class q1{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    float score = scan.nextInt();
    scan.nextLine();
    String department = scan.nextLine();
    System.out.println("my name is "+name);
    System.out.println("my scroe is "+score/10 + "/10");
    System.out.println("my city is "+department);

}
}