public class SentTextCheck {
    public static void main(String[] args) {
        String para="sanjay was good boy.sanjay form karaikudi.sanjay loves cat .sanjay loves more bikes.";
        String keyword="es";
        boolean found =false;
        String[] Sentence=para.split("\\.");
        for( String Sent:Sentence){
            // System.out.println(Sent);
            
            if(Sent.contains(keyword)){
                System.out.println(Sent);
                found = true;
            }
           
        }
        if (!found) {
            System.out.print("not found the charcter");
        }
        
    }
}
