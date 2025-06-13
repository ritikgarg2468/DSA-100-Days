public class Sample {
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        // Method 1: Declare and initialize in one line
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Method 2: Declare first, then initialize
        int[] scores = new int[5];
        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;
        scores[3] = 95;
        scores[4] = 88;

        // 2. Accessing Array Elements
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last score: " + scores[4]);

        // 3. Array Length
        System.out.println("Length of numbers array: " + numbers.length);

        // 4. Iterating through an array
        System.out.println("\nPrinting all numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 5. Using enhanced for loop (for-each)
        System.out.println("\n\nPrinting all scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        // 6. Finding sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\n\nSum of numbers: " + sum);

        // 7. Finding maximum value
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("Maximum score: " + max);

        // 8. String array example
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. 2D Array example
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
