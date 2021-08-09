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
    
    
    public static int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if( a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
    
    public static boolean isPermutationP2(String cad){  
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')- Character.getNumericValue('a') + 1];

        for(char c : cad.toCharArray()){
            int x = getCharNumber(c);
               if( x != -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    public static void main(String[] args){
        if(isPermutationP2("tact")){
            System.out.println("La cadena si forma un palidromo");
        }else{
            System.out.println("La cadena no forma un palidromo");
        }
    }
}
