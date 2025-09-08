
import java.util.Scanner;

class FibonacciSeries
{
    final int FibonacciSeries(int num)
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
            return FibonacciSeries(num - 1) + FibonacciSeries(num - 2);
        }

    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of series: ");
        num = sc.nextInt();
        FibonacciSeries fb = new FibonacciSeries();
        for(int i = 1; i <= num; i++)
        {
            System.out.print(fb.FibonacciSeries(i) + " ");
        }
    }
}