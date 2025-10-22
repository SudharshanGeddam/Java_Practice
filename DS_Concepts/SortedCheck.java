import java.util.Scanner;

public class SortedCheck {

    private void sortCheck(int[] arr, int n){
        boolean checked = false;
        for(int i = 0; i < n-1; i++){
            if(arr[i] < arr[i+1]){
                checked = true;
               
            } 
            else{
                checked = false;
                break;
            }
        }
        if(checked)
        System.out.println("Array is sorted.");
        else
        System.out.println("Array is not sorted");
    }
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            SortedCheck ac = new SortedCheck();
            ac.sortCheck(arr, n);  
        }
    }
}
