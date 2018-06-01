public class MergeSort {
    
    // sort array from index l to r
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    
    public static void merge(int[] arr, int l, int m, int r) {
        
        // copy into 2 sub arrays
        int lSize = m-l+1;
        int rSize = r-m;
        int[] lArray = new int[lSize];
        int[] rArray = new int[rSize];
        for (int i=0; i<lSize; ++i) {
            lArray[i] = arr[i+l];
        }
        for (int j=0; j<rSize; ++j) {
            rArray[j] = arr[j+m+1];
        }
        
        // compare and merge
        int k = l;
        int i = 0;
        int j = 0;
        while (i < lSize && j < rSize) {
            if (lArray[i] < rArray[j]) {
                arr[k] = lArray[i];
                ++i;
            } else {
                arr[k] = rArray[j];
                ++j;
            }
            ++k;
        }
        
        // take care of leftovers
        while (i < lSize) {
            arr[k] = lArray[i];
            ++i;
            ++k;
        }
        while (j < rSize) {
            arr[k] = rArray[j];
            ++j;
            ++k;
        }
    }
    
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]) {
        int[] arr = {12, 11, 4, 13, 5, 8, 6, 7, 1};
 
        System.out.println("Given Array: ");
        printArray(arr);
 
        sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array: ");
        printArray(arr);
    }
}