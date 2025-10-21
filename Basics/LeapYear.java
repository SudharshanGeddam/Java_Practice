
import java.util.Scanner;

class LeapYear
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year;
            System.out.println("Enter a year: ");
            year = sc.nextInt();
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is leap year.");
            else
            System.out.println(year + " is not a leap year.");
        }
    }
}