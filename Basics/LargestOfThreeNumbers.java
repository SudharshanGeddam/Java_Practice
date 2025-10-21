
import java.util.Scanner;

class LargestOfThreeNumbers
{
    public static void main(String[] args) {
        int num1, num2, num3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any three integers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
        }
        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println(num2 + " is greater than " + num1 + " and " + num3);
        }
        else
        {
            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
        }
    }
}