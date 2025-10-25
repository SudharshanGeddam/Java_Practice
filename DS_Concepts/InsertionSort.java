public class InsertionSort {
    void display(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    void search(int[] arr, int n){
        for(int i = 1; i < n; i++){
           int temp = arr[i];
           int j = i-1;
           while(j >= 0 && arr[j] > temp){
            arr[j+1] = arr[j];
            j--;
           }
           arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = {45, 89,78, 20, 12, 63};
        int n = arr.length;
        System.out.println("Array before sorting is: ");
        InsertionSort is = new InsertionSort();
        is.display(arr, n);
        is.search(arr, n);
        System.out.println("Array after sorting is: ");
        is.display(arr, n);
    }
}
