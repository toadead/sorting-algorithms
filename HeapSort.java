public class HeapSort {

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, 6, 1, 9, 5, 8};
        System.out.print("Original Array: ");
        printArray(myArray);
        sort(myArray);
    }

    private static void sort(int[] arr) {
        int last = arr.length - 1;
        
        // build max heap groud up from first non-leaf layer
        System.out.println("\nBuilding max heap from array: ");
        for (int i = last/2; i >= 0; --i) {
            arr = buildMaxHeap(arr, arr.length, i);
            printArray(arr);
        }
        
        // put root node towards end
        System.out.println("\nSticking greatest node towards end of heap: ");
        for (int i = last; i >= 0; --i) {
            arr = swap(arr, 0, i);
            printArray(arr);
            arr = buildMaxHeap(arr, i, 0);     // adjust max heap from root
            printArray(arr);
        }
    }
    
    private static int[] buildMaxHeap(int[] arr, int heapSize, int i) {
        int max = i;
        int left = i * 2 + 1;
        int right = left + 1;
        
        if (left < heapSize && arr[left] > arr[max]) {
            max = left;
        }
        
        if (right < heapSize && arr[right] > arr[max]) {
            max = right;
        }
        
        if (max != i) {
            arr = swap(arr, i, max);
            buildMaxHeap(arr, heapSize, max);
        }
        
        return arr;
    }
    
    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    
    private static void printArray(int[] arr) {
        for(int ele : arr) {
            System.out.printf(ele + " ");
        }
        System.out.println();
    }
}