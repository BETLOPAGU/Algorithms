public class E7 {
    //Solucion del libro
    public static int[][] RotateMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix.length != matrix[0].length)
            System.out.println("La matriz no es nxn");   

        int n = matrix.length;
        for(int layer= 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                //save top
                int top = matrix[first][i];
                //left -> top
                matrix[first][i] = matrix[last-offset][first];
                //bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                //right -> borrom
                matrix[last][last-offset] = matrix[i][last];
                //top -> right
                matrix[i][last] = top; //right <- saved top
            }
        }
        return matrix;
    }

    //Mine solution
    public static int[][] MRotateMatrix(int[][] matrix){
        int[][] nmatrix = new int[matrix.length][matrix.length];
        int col, row = 0;

        for(int i = matrix.length -1; i >= 0; i--){
            col = 0;
            for(int j = 0; j < matrix.length; j++){
                nmatrix[row][col] = matrix[i][j];
                col++; 
            }   
            row++;      
        }
        return nmatrix;
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
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nmatrix = MRotateMatrix(matrix);
        Print(nmatrix);
    }
}
