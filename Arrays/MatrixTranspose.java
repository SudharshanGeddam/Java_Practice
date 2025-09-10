class MatrixTranspose
{
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] arr = {{4, 56, 52}, {52, 4, 69, 90}};
        int[][] transpose = new int[cols][rows];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Matrix before transpose:\n");
        PrintMatrix(rows, cols, arr);
        System.out.println("Matrix after transpose:\n");
        for(int i = 0; i < cols; i++)
        {
            for(int j = 0; j < rows; j++)
            {
                System.err.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void PrintMatrix(int rows, int cols, int[][] mat)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.err.println(" ");
        }      
    }
}