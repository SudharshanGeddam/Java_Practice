
import java.util.Scanner;

class SwappingTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opt;
        System.err.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.err.println("Numbers before swapping is: num1 = " + num1 + " and num2 = " + num2);
        System.err.println("Press 1 for swapping using third variable\nPress 2 for swapping without using third variable\n");
        opt = sc.nextInt();
        switch (opt) {
            case 1 -> {
                int temp = num1;
                num1 = num2;
                num2 = temp;
                System.out.println("Numbers after swapping is: num1 = " + num1 + " and num2 = " + num2);
            }
            case 2 -> {
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
                System.out.println("Numbers after swapping is: num1 = " + num1 + " and num2 = " + num2);
            }
            default -> System.out.println("Invalid Input");
        }
    }
}
