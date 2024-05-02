public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            // Creating a string
            String str = "Hello";

            // Trying to access an index beyond the string's length
            char ch = str.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}