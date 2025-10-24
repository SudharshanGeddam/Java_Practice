import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {58,45,75,96,12,36};
        int target,  pos = 0;
        boolean found = false;
        System.out.println("Enter element you want to find: ");
        try(Scanner sc = new Scanner(System.in)){
            target = sc.nextInt();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                    found = true;
                    pos = i;
                    break;
                }
            }
            if(found){
                System.out.println("Target found at position: " + pos);
            }
            else{
                System.out.println("Target not found");
            }
        }
    }
}
