class LargestAndSmallestElement
{
    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 19};
        int n = arr.length;
        int min = arr[0], max = arr[0];
        int i = 0;
        while(i < n)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            else if(arr[i] > max)
            {
                max = arr[i];
            }
            i++;
        }
        System.out.println("Minimum element in the array is: " + min);
        System.out.println("Maximum element in the array is: " + max);
    }
}