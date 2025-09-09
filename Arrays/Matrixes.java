import java.util.Scanner;

class Matrixes
{
    public static void PrintArray(int rows, int cols, int[][] arr)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public static void AdditionOfMatrixes(int rows, int cols, int[][] arr1, int[][] arr2){
        System.out.println("Addition of two matrixes is: ");
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        PrintArray(rows, cols, sum);
    }

    public static void SubtractionOfMatrixes(int rows, int cols, int[][] arr1, int[][] arr2)
    {
        System.out.println("Subtraction of two matrixed is: ");
        int[][] diff = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                diff[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        PrintArray(rows, cols, diff);
    }
    
    public static void MultiplicationOfMatrixes(int rows, int cols, int[][] arr1, int[][] arr2)
    {
        int[][] mult = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                mult[i][j] = 0;
                for(int k = 0; k < cols; k++)
                {
                    mult[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        PrintArray(rows, cols, mult);
    }
    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Matrix program!");
        int rows, cols;
        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        cols = sc.nextInt();
        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        System.out.println("Enter first array elements:\n");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array elements:\n");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Exit");
        System.out.println("Choose any one option from above list: ");
        opt = sc.nextInt();
        switch(opt)
        {
            case 1 -> {
                AdditionOfMatrixes(rows, cols, arr1, arr2);
            }
            case 2 -> {
                SubtractionOfMatrixes(rows, cols, arr1, arr2);
            }
            case 3 -> {
                MultiplicationOfMatrixes(rows, cols, arr1, arr2);
            }
            case 4 -> {
                System.out.println("Program Exited!!!");
            }
            default -> System.out.println("Invalid Option!");
        }
    }
}