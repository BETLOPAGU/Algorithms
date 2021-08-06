public class E8 {

    public static void ZeroMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRow(matrix, i);
                    zeroColumn(matrix, j);
                }
            }
            System.out.println(' ');
            Print(matrix);
        }
        
    }

    public static void zeroRow(int[][] matrix, int row){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }

    public static void zeroColumn(int[][] matrix, int column){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }

    public static void Print(int[][] matrix){
        for (int x=0; x < matrix.length; x++) {
            System.out.print("|");
            for (int y=0; y < matrix[x].length; y++) {
              System.out.print (matrix[x][y]);
              if (y!=matrix[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,0},{1,2,1},{1,2,2}};
        ZeroMatrix(matrix);

    }
}

