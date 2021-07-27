public class E4 {

    public static boolean isPermutationP(String cad){
        boolean foundOdd = false;

        int[] HT = new int[128];
        
        for( char c : cad.toCharArray())
            HT[c]++;

        for(int num : HT){
            if(num % 2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }    


    public static void main(String[] args){
        if(isPermutationP("hann")){
            System.out.println("La cadena si forma un palidromo");
        }else{
            System.out.println("La cadena no forma un palidromo");
        }
    }
}
