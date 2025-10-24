import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {12,24,36,48,60,72,84,96,108};
        int target, pos = 0;
        boolean found = false;
        System.out.println("Enter element you want to search: ");
        try(Scanner sc = new Scanner(System.in)){
            target = sc.nextInt();
            int high = arr.length-1, low = 0;
            while(low <= high)
            {
                int mid = (low + high)/2;
                if(target == arr[mid]){
                    found = true;
                    pos = mid;
                    break;
                } else if(target > arr[mid]){
                    low = mid + 1;
                } else if(target < arr[mid]){
                    high = mid - 1;
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
