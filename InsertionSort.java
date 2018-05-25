/*
*  Insertion sort is just like playing cards.
*  Put each card in sorted order. 
*  Execution time for insertion sort is O(n^2)
*/

public class InsertionSort {

    static void sort(int arr[]) {
        // start from 2nd item
        for (int i=1; i<arr.length; ++i) {
            int key = arr[i];
            
            // compare items in front, start from back
            int insertPoint = i;
            for (int j=i-1; j>=0; --j) {
                if (key < arr[j]) {
                    arr[j+1] = arr[j];  // shift 1 back
                    insertPoint = j;
                } else {
                    insertPoint = j + 1;
                    break;
                }
            }
            arr[insertPoint] = key;
            
            printArray(arr);
        }
    }
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String args[]) {        
        int[] myArray = {6, 3, 2, 5, 8, 1};
        System.out.print("Original array: ");
        printArray(myArray);
        System.out.println("\nSorting array: ");
        sort(myArray);
    }
}