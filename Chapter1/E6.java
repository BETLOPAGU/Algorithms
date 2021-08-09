public class E6 {
 
    public static String StringCompress(String cad){
        int countconst=0;
        int finalLength = CountCompression(cad);
        StringBuilder st = new StringBuilder(finalLength);
        
        for(int i = 0; i < cad.length(); i++){
            countconst++;

            if( i + 1 >= cad.length() || cad.charAt(i) != cad.charAt(i+1) ){
                st.append(cad.charAt(i));
                st.append(countconst);
                countconst = 0;
            }
        }
        return st.length() < cad.length() ? st.toString() : cad;
    }

    public static int CountCompression(String cad){
        int compressLenght = 0;
        int countConsecutive = 0;

        for(int i = 0; i < cad.length(); i++){
            countConsecutive++;

            if( i + 1 >= cad.length() || cad.charAt(i) != cad.charAt(i+1) ){
                compressLenght += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }

        return compressLenght;
    }
    public static void main(String[] args){
        System.out.println(StringCompress("aaaabbbbtt"));
    }
}
