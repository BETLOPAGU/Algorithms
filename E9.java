public class E9 {
    
    public static boolean isSubstring(String CadOri, String SubCad){
        boolean val = false;

        if(CadOri.length() != SubCad.length())
            return false; 

        for(int i = 0; i < CadOri.length(); i++){
            
        }

        return val;
    }

    public static void main(String[] args){
        if(isSubstring("Cafe", "afeC")){
            System.out.println("Si es una subadena");
        }else{
            System.out.println("No es una subadena");
        }
    }
}
