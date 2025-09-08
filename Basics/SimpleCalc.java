
import java.util.Scanner;

class SimpleCalc
{
    public static void main(String[] args) {
        int num1, num2, opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.err.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println(" 1. Addition\n 2. Subtraction\n 3. Division\n 4. Multiplication\n 5. Exit");
        opt = sc.nextInt();
        switch(opt) 
        {
            case 1 ->
            {
                System.out.println("Addition of " + num1 + " and " + num2 + " is: " +(num1 + num2));
            }
            case 2 ->
            {
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " +(num1 - num2));
            }
            case 3 ->
            {
                System.out.println("Division of " + num1 + " and " + num2 + " is: " +(num1 / num2));

            }
            case 4 ->
            {
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " +(num1 * num2));

            }
            case 5 ->
            {
                break;
            }
            default -> {
                System.out.println("Invalid option");
            }
        }
    }
}