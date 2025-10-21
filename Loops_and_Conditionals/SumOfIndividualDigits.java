
import java.util.Scanner;

class SumOfIndividualDigits
{
    public static void main(String[] args) {
        int num;
        int sum = 0, rem;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        int temp = num;
        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of individual digits of " + temp + " is: " + sum);
    }
}