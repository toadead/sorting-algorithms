public class BubbleSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i=0; i<=size-1; ++i) {
            boolean swapped = false;
            for (int j=0; j<=size-2; ++j) {
                if (arr[j+1] < arr[j]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }   

            if (!swapped) {
                break;
            }
        }
    }
    
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
 
    /* Prints the array */
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Input array");
        printArray(arr);
        sort(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
