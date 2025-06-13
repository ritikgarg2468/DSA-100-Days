/**
 * A class implementing the binary search algorithm.
 * Binary search is an efficient algorithm for finding an element in a sorted array.
 */
public class BinarySearch {
    /**
     * Performs binary search on a sorted array to find the target element.
     * @param arr The sorted array to search in
     * @param target The element to find
     * @return The index of the target element if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target) {
        // Initialize the search boundaries
        int start = 0;
        int end = arr.length - 1;

        // Continue searching while the search space is valid
        while(start <= end){
            // Calculate middle index to avoid integer overflow
            int mid = start + (end - start) / 2;

            // If target is found at mid, return the index
            if(arr[mid] == target){
                return mid;
            }
            // If target is greater, ignore left half
            else if(arr[mid] < target){
                start = mid + 1;
            }
            // If target is smaller, ignore right half
            else{
                end = mid - 1;
            }
        }
        // Element not found
        return -1;
    }

    /**
     * Main method to demonstrate binary search functionality
     */
    public static void main(String[] args) {
        // Test array (must be sorted for binary search)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 4;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }
}
