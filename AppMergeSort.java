public class AppMergeSort {

    // Merge Sort function - recursively sorts the array
    public static void MergeSort(int[] arr, int leftIndex, int rightIndex) {

        // Base condition: If left index is less than right index, proceed with sorting
        if (leftIndex < rightIndex) {
            // Find the middle index to divide the array into two halves
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Recursively sort the left half
            MergeSort(arr, leftIndex, midIndex);

            // Recursively sort the right half
            MergeSort(arr, midIndex + 1, rightIndex);

            // Merge the sorted halves back into a single sorted array
            merge(arr, leftIndex, midIndex, rightIndex);
        }
    }

    // Merge function - combines two sorted subarrays into a single sorted array
    public static void merge(int[] arr, int leftIndex, int midIndex, int rightIndex) {

        // Calculate the sizes of left and right subarrays
        int leftSize = midIndex - leftIndex + 1;
        int rightSize = rightIndex - midIndex;

        // Create temporary arrays to store the left and right subarrays
        int[] tempLeftArr = new int[leftSize];
        int[] tempRightArr = new int[rightSize];

        // Copy the left subarray into the tempLeftArr array
        for (int i = 0; i < leftSize; i++) {
            tempLeftArr[i] = arr[leftIndex + i]; // Copy elements from leftIndex to midIndex into tempLeftArr
        }

        // Copy the right subarray into the tempRightArr array
        for (int j = 0; j < rightSize; j++) {
            tempRightArr[j] = arr[midIndex + 1 + j]; // Copy elements from midIndex+1 to rightIndex into tempRightArr
        }

        // Indices for traversing through the temporary arrays and the original array
        int i = 0, j = 0, mergeIndex = leftIndex;

        // Compare elements from both subarrays and merge them into the original array
        while (i < leftSize && j < rightSize) {
            // If the current element in tempLeftArr is smaller or equal, copy it to arr
            if (tempLeftArr[i] <= tempRightArr[j]) {
                arr[mergeIndex] = tempLeftArr[i];
                i++; // Move to the next element in the left subarray
            } else {
                // If the current element in tempRightArr is smaller, copy it to arr
                arr[mergeIndex] = tempRightArr[j];
                j++; // Move to the next element in the right subarray
            }
            mergeIndex++; // Move to the next position in the merged array
        }

        // If there are remaining elements in the left subarray, copy them to arr
        while (i < leftSize) {
            arr[mergeIndex] = tempLeftArr[i];
            i++;
            mergeIndex++;
        }

        // If there are remaining elements in the right subarray, copy them to arr
        while (j < rightSize) {
            arr[mergeIndex] = tempRightArr[j];
            j++;
            mergeIndex++;
        }
    }

    // Main function to test the Merge Sort algorithm
    public static void main(String[] args) {
        // Sample unsorted array
        int[] num = {5, 3, 8, 4}; 

        // Call MergeSort to sort the array
        MergeSort(num, 0, num.length - 1);

        // Print the sorted array to check the result
        for (int val : num) {
            System.out.println(val);
        }
    }
}