import java.util.Scanner;
class ifelse{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String light=scan.nextLine();
        if(light.equals("red"))
        {
            System.out.println(("red"));
        }
        else if (light.equals("green")){
            System.out.println("go to race");
        }
        else if (light.equals("yellow"))
        {
            System.out.println("ready");
        }

        else{
            System.out.println("techincal issue ");
        }
    }
}