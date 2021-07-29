public class E5 {
    
    public static boolean isEditCorrectly(String cadOrg, String cadEdi){
        
        if(cadOrg.length() == cadEdi.length()){
            boolean flag = false;
            for(int i = 0; i < cadOrg.length(); i++){
                if(cadOrg.charAt(i) != cadEdi.charAt(i)){
                    if(flag){
                        return false;
                    }
                    flag = true;
                }
            }

            return true;
        }else if(cadOrg.length() - 1 == cadEdi.length()){

        }else if(cadOrg.length() + 1 == cadEdi.length()){

        }

        return true;
    }

    public static void main(String[] args){
        if(isEditCorrectly("cad", "cep")){
            System.out.println("La cadena si esta editada correctamente");
        }else{
            System.out.println("La cadena no esta editada correctamente");
        }
    }
}
