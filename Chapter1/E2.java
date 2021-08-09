import java.util.*;

public class E2 {
    public static boolean isPermutationSV(String cadOrig, String percad){
        if(cadOrig.length() != percad.length()){
            return false;
        }

        char Orig[] = cadOrig.toCharArray();
        char Perm[] = percad.toCharArray();

        Arrays.sort(Orig);
        Arrays.sort(Perm);
     
        for (int i = 0; i < cadOrig.length(); i++)
        if (Orig[i] != Perm[i])
            return false;
     
        return true;
    }

    public  static boolean isPermutationHT(String cadOrig, String percad){
        if(cadOrig.length() != percad.length()){
            return false;
        }

        int[] HT = new int[128];
        char[] char_array = cadOrig.toCharArray(); 

        for( char c : char_array)
            HT[c]++;

        for(int i = 0; i < percad.length(); i++){
            int index = (int) percad.charAt(i);
            HT[index]--;
            if(HT[index] < 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {		
        if(isPermutationSV("aidan", "nadio")){
            System.out.println("La cadena es permutacion de la original");
        }else{
            System.out.println("La cadena no es permutacion de la original");
        }  
        
        if(isPermutationHT("aidao", "nadia")){
            System.out.println("La cadena es permutacion de la original");
        }else{
            System.out.println("La cadena no es permutacion de la original");
        } 
	}
}
