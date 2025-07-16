public class dupilicate {
    public static void main(String[] args) {
        int a[]={50,40,30,10};
       
       
        //print original array  
        System.out.println("original array");
        for(int i=0;i<a.length ;i++){
            System.out.println(" "+ a[i]);
        }
        //copy array
        int dupilicate[] = new int[a.length];
        for (int i=0;i<a.length;i++){
            dupilicate[i] =a[i];
           
        }
//copy array print
        System.out.println("copy array");
        for(int j=0;j<dupilicate.length;j++){
            System.out.println(dupilicate[j]+" ");
        }
    }
}
