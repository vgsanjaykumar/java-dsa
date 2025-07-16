
import java.util.Scanner;

public class oddoreven{
    void passorfail(int total)
    {
    
       if (total%2==0)
       {
          System.out.println("even number");
        }
        else{
            System.out.println("odd number");
         }
   
    }

    String failorpass(int marks)
    {
        if (marks>34)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total=scan.nextInt();
        oddoreven obj=new oddoreven();
         obj.passorfail(total);
         System.out.println("enter ur maths marks");
         int marks=scan.nextInt();
        String totalmark= obj.failorpass(marks);
         System.out.println(totalmark);

    }

}


