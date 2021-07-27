public class E1 {
    public static boolean isUniqueCharacterBV(String cad){
        int checker = 0;
        for (int i = 0; i < cad.length(); ++i) {
            int val = cad.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
    
    public static boolean isUniqueCharacterHT(String cad){
        boolean[] HT = new boolean[128];
        for( int i = 0; i < cad.length(); i++){
            int val = cad.charAt(i);

            if(HT[val]){
                return false;
            }

            HT[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {		
		System.out.println("Hola Mundo");
        
        if(isUniqueCharacterBV("hola mundi")){
            System.out.println("Son únicos los caracteres");
        }    
        
        if(isUniqueCharacterHT("hola mundi")){
            System.out.println("Son únicos los caracteres");
        }  
	}
}

