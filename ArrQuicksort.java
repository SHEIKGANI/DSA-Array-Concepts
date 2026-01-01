public class ArrQuicksort {

    public static void Quicksort(int[] arr, int start, int end) {

        if (start < end) {

            // Partition the array and get the pivot position
            int newPivotpos = partAndsort(arr, start, end);

            // Recursively sort the left sub-array (before the pivot)
            Quicksort(arr, start, newPivotpos - 1);

            // Recursively sort the right sub-array (after the pivot)
            Quicksort(arr, newPivotpos + 1, end);
        }
    }

    static int partAndsort(int[] arr, int start, int end) {

        // Choose the pivot as the last element in the sub-array
        int pivot = arr[end];
        
        // Initialize the pointer for the smaller element sub-array
        int i = start - 1;

        // Traverse through the array to rearrange elements based on the pivot
        for (int j = start; j < end; j++) {
            // If the current element is smaller than the pivot, swap it with the element at index i
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at position i + 1
        // This places the pivot in its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        // Return the new pivot position
        return i + 1;
    }

    // Main method to test QuickSort
    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 3, 9, 5};

        Quicksort(arr, 0, arr.length-1);

        for (int val : arr) {
            System.out.println(val);
        }
    }
}