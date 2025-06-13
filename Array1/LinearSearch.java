public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If target element is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If target element is not found, return -1
        return -1;
    }
    
    // Main method to test the linear search
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        
        int result = linearSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
