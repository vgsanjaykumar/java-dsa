public class VowelsCount {
    public static void main(String args[]){
        String vowels="sanjaykumar V A";
        String vow=vowels.toLowerCase();
        // int count=0;
        // for(int i=0;i<=vow.length()-1;i++){
        //     char ch=vow.charAt(i);
           
        //     switch(ch){
        //         case 'a':
        //         case 'e':
        //         case 'i':
        //         case 'o':
        //         case 'u': count++;  
        //         System.out.println(ch);

        //     }
           
        // }
        // System.out.println(count +" vowels is present in for letter");


        System.out.println("without using string method");
            int c=0;
            int v=0;
            String s1="sanjay";
            String vowel="";
            String cons="";

            char[] s2 =s1.toCharArray();
            for(int i=0;i<s2.length;i++){
                char ch=s2[i];

              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
                vowel +=ch;
                
                 
              }else{
                v++;
                cons+=ch;
                
               
                
                
              }
            }
            System.out.println();
            System.out.println(vowel);
            System.out.println(cons);
            System.out.println("vowels count:"+c);
            System.out.println("constant count:" + v);
    }
}
