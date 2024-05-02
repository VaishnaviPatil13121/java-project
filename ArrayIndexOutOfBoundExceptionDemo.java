public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            // Creating an array with size 3
            int[] arr = new int[3];

            // Trying to access an index beyond the array's bounds
            int value = arr[5];
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}