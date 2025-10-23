import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args){
        String str;
        StringBuilder strRev = new StringBuilder();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            str = sc.nextLine();
            char[] ch = str.toCharArray();
            for(int i = ch.length-1; i >= 0; i--){
              strRev.append(ch[i]);
            }
            String reversed = strRev.toString();
            if(str.equals(reversed)){
                System.out.println("It is a palindrome.");
            }
            else{
                System.out.println("It is not a palindrome.");
            }
        }

    }
}
