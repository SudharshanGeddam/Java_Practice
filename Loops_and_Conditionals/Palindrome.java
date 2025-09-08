
import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args) {
        int num, temp;
        int rem, sum = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        temp = num;
        while(num != 0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(sum == temp)
        System.out.println("Entered number " + temp + " is a palindrome.");
        else
        System.out.println("Entered number " + temp + " is not a palindrome.");
    }
}