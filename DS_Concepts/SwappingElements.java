import java.util.Scanner;

public class SwappingElements {
    private void swap(int[] arr, int n){
        int j = 1;
        for(int i = 0; i < n; i += 2){
            int temp = arr[i];
            for(j = j+i; j <= n-1; ){
                arr[i] = arr[j];
                arr[j] = temp;
                break; 
            }
        }
        System.out.println("Elements after swapping adjacents: ");
        for(int i =0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
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
            SwappingElements se = new SwappingElements();
            se.swap(arr, n);    
        }
    }
}
