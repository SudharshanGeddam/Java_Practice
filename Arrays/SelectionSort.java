class SelectionSort
{
    public static void main(String[] args) {
        int[] arr = {12, 15, 63, 1, 98, 20, 41, 4};
        int n = arr.length;
        System.out.println("Array before sorting:\n");
        PrintArray(arr, n);
        for(int i = 0; i < n; i++)
        {
            int min = i;
            for(int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                Swap(arr, i, min);
            }
        }
        System.out.println("Array after sorting:\n");
        PrintArray(arr, n);
    }

    public static void Swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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