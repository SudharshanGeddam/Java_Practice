
import java.util.Scanner;

class GcdAndLcm {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();
        }
        int x = num1, y = num2;
        while(y!=0)
        {
            int temp = y;
            y = x % y;
            x = temp;
        } 
        int gcd = x;
        int lcm = (num1 * num2) / gcd;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}