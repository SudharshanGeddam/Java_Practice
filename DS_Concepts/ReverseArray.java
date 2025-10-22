import java.util.Scanner;

public class ReverseArray {

    private void reverse(int[] arr, int n){
        System.out.println("Array elements in reverse order: ");
        for(int i = n-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    public  static void main(String[] args){
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array elements are: ");
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
            ReverseArray rev = new ReverseArray();
            rev.reverse(arr, n);
        }
    }
}
