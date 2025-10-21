
import java.util.Scanner;

class Armstrong
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
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(temp == sum)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is not an Armstrong number");
    }
}