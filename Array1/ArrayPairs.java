public class ArrayPairs {

    public static void arrayPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayPairs(array);
    }
}