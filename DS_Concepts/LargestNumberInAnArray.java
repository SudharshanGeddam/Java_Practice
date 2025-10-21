import java.util.Scanner;

class LargestNumberInAnArray{
    void findLargest(int[] arr, int n){
        int largestNum = arr[0];
        if(n == 1){
            System.out.println("Largest number in the array is: " + largestNum);
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > largestNum){
                    largestNum = arr[i];
            } 
        }
        System.out.println("Largest number in the array is: " + largestNum);
    }
    public static void main(String[] args){
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            LargestNumberInAnArray lnum = new LargestNumberInAnArray();
            lnum.findLargest(arr, n);
        }
    }
}