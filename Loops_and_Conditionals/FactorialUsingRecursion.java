
import java.util.Scanner;

class FactorialUsingRecursion
{
    final int Factor(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * Factor(num - 1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        num = sc.nextInt();
        FactorialUsingRecursion obj = new FactorialUsingRecursion();
        int result = obj.Factor(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

}