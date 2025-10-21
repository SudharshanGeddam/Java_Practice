import java.util.Scanner;
class Reversing_String {
    public static void main(String[] args){
        String str;
        System.out.println("Enter a string: ");
        try (Scanner sc = new Scanner(System.in)) {
            str = sc.nextLine();
        }
        System.out.println("The Entered string is: " + str); 
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The Reversed string is: " + rev);
    }
}