import java.util.Scanner;

public class SecondLargestNum {

    void findSecondLargest(int[] arr, int n){
        int largestNum = arr[0];
        int secondLargest = 0;
        if(n == 1){
            System.out.println("Second Largest number not found in the array");
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > largestNum){
                secondLargest = largestNum;
                largestNum = arr[i];       
            } else if(arr[i] > secondLargest && arr[i] < largestNum){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest number in the array is: " + largestNum);
        System.out.println("Second largest number in the array is: " + secondLargest);
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
            SecondLargestNum lnum = new SecondLargestNum();
            lnum.findSecondLargest(arr, n);
        }
    }
}
