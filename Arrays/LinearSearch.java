
import java.util.Scanner;

class LinearSearch
{
    public static void main(String[] args) {
        int arr[] = {10, 25, 36, 85, 0, 1, 5, 9};
        int n = arr.length;
        PrintArray(arr, n);
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the element you want to search: ");
            num = sc.nextInt();
        }
        if(num == arr[0])
        {
            System.out.println(num + "found at " + 0 + "th position.");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                if(num == arr[i])
                {
                    System.out.println(num + " found at " + i + "th position.");
                }
            }
        }
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