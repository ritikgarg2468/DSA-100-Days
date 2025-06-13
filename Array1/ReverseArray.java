public class ReverseArray {
    
    // Method 1: Using a temporary array
    public static int[] reverseUsingTempArray(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        
        // Copy elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j] = arr[i];
            j++;
        }
        
        return temp;
    }
    
    // Method 2: Using in-place swapping
    public static void reverseInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
    }
    
    // Main method to test both approaches
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Test Method 1
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        int[] reversed1 = reverseUsingTempArray(arr);
        System.out.println("Reversed using temp array: " + java.util.Arrays.toString(reversed1));
        
        // Test Method 2
        System.out.println("\nOriginal array: " + java.util.Arrays.toString(arr));
        reverseInPlace(arr);
        System.out.println("Reversed in-place: " + java.util.Arrays.toString(arr));
    }
}
