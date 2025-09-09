
import java.util.Scanner;

class BinarySearch
{
    public static void main(String[] args) {
        int arr[] = {10, 12, 25, 63, 94, 95, 100};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        PrintArray(arr, n);
        System.err.println("Enter the element you want to search: ");
        int target = sc.nextInt();
        int result = BinarySearch(arr, n, target);
        if(result != -1)
        System.out.println("Element found at position: " + result);
        else
        System.out.println("Element not found");
    }
    public static int BinarySearch(int arr[], int n, int target)
    {
        int left = 0, right = n-1; 
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if( target < arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void PrintArray(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}