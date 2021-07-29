public class E6 {
 
    public static String StringCompress(String cad){
        String newcad = "";
        int countconst=0;
        
        
        for(int i = 0; i < cad.length(); i++){
            countconst++;

            if( i + 1 >= cad.length() || cad.charAt(i) != cad.charAt(i+1) ){
                newcad = newcad + cad.charAt(i) + countconst + "";
                countconst = 0;
            }
        }
        return newcad.length() < cad.length() ? newcad : cad;
    }
    public static void main(String[] args){
        System.out.println(StringCompress("aaaabbbbtt"));
    }
}
