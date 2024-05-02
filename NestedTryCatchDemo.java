public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");

            try {
                // Inner try block
                System.out.println("Inner try block starts.");

                // Simulating an exception
                int result = 5 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException innerException) {
                // Inner catch block
                System.out.println("Inner catch block: " + innerException.getMessage());
            }

            // Code after inner try-catch block
            System.out.println("Outer try block continues.");
        } catch (Exception outerException) {
            // Outer catch block
            System.out.println("Outer catch block: " + outerException.getMessage());
        }

        // Code after outer try-catch block
        System.out.println("End of program.");
    }
}