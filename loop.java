
class loop {

    public static void main(String[] args) {

        /*for(int i=1;i<=10;i++)
      {     
        if(i%2==0)                                               // for loop print 10 number and print even number
        System.out.println(i);
      }*/

      
        //print 1to 10 num and print odd number count
/*
        int count=0;
        for (int i=0;i<=10;i++)
        {
            if(i%2==1)
            {
            
                System.out.println("odd number"+i);
                count = count + 1;
            }
           
        }
         System.out.println("count:" +count);


         */
        //print which number divisible by 3 and 5 range 1-10
        int count = 0;
        for (int i = 0;
                i
                <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count = count + 1;
            }
        }

        System.out.println(
                "number count:" + count);
    }


    /*Scanner scan=new Scanner(System.in);
      System.out.println("enter a");
      int a=scan.nextInt();
      System.out.println("enter b");
      int b =scan.nextInt();
      for (int i=a; i<=b;i++)
      {
        System.out.println(i);
      }
      
     */

  
}
