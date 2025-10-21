
import java.util.Scanner;

class FibonacciSeries
{
    final int fibonacciSeries(int num)
    {
        if (num <= 0)
        {
            return 0;
        }
        else if (num == 1)
        {
            return 1;
        }
        else
        {
            return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
        }

    }
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter range of series: ");
            num = sc.nextInt();
        }
        FibonacciSeries fb = new FibonacciSeries();
        for(int i = 1; i <= num; i++)
        {
            System.out.print(fb.fibonacciSeries(i) + " ");
        }
    }
}