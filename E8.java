public class E8 {

    public static void ZeroMatrix(int[][] matrix){
        int[] col = new int[matrix.length];
        int[] row = new int[matrix[0].length];
        int i, j;
        for( i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    col[j] = -1;
                    row[i] = -1;
                }
            }
        }

        for( i = 0; i < row.length; i++){
            if(row[i] == -1) zeroRow(matrix, i);
        }
        
        for( i = 0; i < col.length; i++){
            if(col[i] == -1) zeroColumn(matrix, i);
        }

        Print(matrix);
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

