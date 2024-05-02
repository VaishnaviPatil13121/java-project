public class MultipleCatchBlocksDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[3] / 0; // This will throw both ArrayIndexOutOfBoundsException and ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block to catch any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Code after the try-catch block
        System.out.println("End of program.");
    }
}