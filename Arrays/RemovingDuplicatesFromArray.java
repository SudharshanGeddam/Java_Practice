
import java.util.Arrays;

class RemovingDuplicatesFromArray
{
    public static void main(String[] args) {


        int[] arr = {14, 52, 20, 20, 20, 20, 85};
        int n = arr.length;
        System.out.println("Original array:");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        /* By using HashSet

        HashSet<Integer> arr1 = new HashSet<>();
        System.out.println(" ");
        for(int num : arr)
        {
            arr1.add(num);
        }
        */
        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < j; i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}