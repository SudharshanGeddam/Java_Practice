
import java.util.Scanner;

class PrimesInRange 
{
    public static void main(String[] args) {
        int start, end;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the start of the range:");
            start = sc.nextInt();
            System.out.println("Enter the end of the range:");
            end = sc.nextInt();
        }
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for(int num = start; num <= end; num++)
        {
            if(isPrime(num))
            {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}