class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {12, 15, 63, 1, 98, 20, 41, 4};
        int n = arr.length;
        System.out.println("Array before sorting:\n");
        PrintArray(arr, n);
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting:\n");
        PrintArray(arr, n);
    }

    public static void PrintArray(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}