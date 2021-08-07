public class E9 {
    
    public static boolean isSubstring(String CadOri, String SubCad){    
        int i = 0, aux;

        for(aux = 0; aux < SubCad.length(); aux++){
            if(CadOri.charAt(i) == SubCad.charAt(aux)){
                i++;                
                if(i == CadOri.length()){
                    return true;
                }
            }else{
                i = 0;
                if(CadOri.charAt(i) == SubCad.charAt(aux))
                    i++;
            }                 
        }
        return false;
    }

    public static boolean StringRotation(String CadOri, String SubCad){boolean a = CadOri.length() == SubCad.length() && isSubstring(CadOri, SubCad+SubCad) ? true : false; return a;}

    public static void main(String[] args){
        String Org = "Cafe";
        String SubCad = "afeC"; 
        
        if(StringRotation(Org, SubCad)){
            System.out.println("Si es una cadena rotada");
        }else{
            System.out.println("No es una cadena rotada");
        }
    }
}
