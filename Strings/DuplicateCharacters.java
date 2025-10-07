import java.util.Scanner;
class DuplicateCharacters{
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        str = sc.nextLine();
        char ch;
        System.out.println("Duplicate Characters: ");
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++){
                if(ch == str.charAt(j)){
                    System.out.print(ch + " ");
                    break;
                }
            }
        }
    }
}