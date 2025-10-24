public class BubbleSort {

    void display(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    /*void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }*/

    public static void main(String[] args){
        int[] arr = {45, 89,78, 20, 12, 63};
        int n = arr.length;
        System.out.println("Array before sorting is: ");
        BubbleSort bs = new BubbleSort();
        bs.display(arr, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting is: ");
        bs.display(arr, n);
    }
}
