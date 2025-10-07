import java.util.List;
import java.util.Scanner;
class VowelsAndConsonantsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vowelsCount = 0, consonantCount = 0;
        String str;
        System.out.println("Enter a String: ");
        str = sc.nextLine();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        if(str.length() == 0){
            System.out.println("Empty String");
            return;
        }
        char ch;
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(vowels.contains(ch)){
                vowelsCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantCount);
    }
}