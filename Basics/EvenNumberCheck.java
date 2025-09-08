
import java.util.Scanner;

class EvenNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a integer: ");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Entered " + num + " is an even number.");
        } else
        {
            System.out.println("Entered " + num + " is a odd number.");
        }
    }
}