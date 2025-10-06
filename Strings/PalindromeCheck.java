import java.util.Scanner;
class PalindromeCheck{
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("Entered  string is: " + str);
        String rev = new StringBuilder(str).reverse().toString();
        str = str.toLowerCase();
        rev = rev.toLowerCase();
        if(str.equals(rev))
        {
            System.out.println("Enterd String is palindrome.");
        }
        else
        {
            System.out.println("Entered String is not a palindrome.");
        }
    }
}