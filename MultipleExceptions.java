import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 1) {
                throw new NullPointerException();
            } else if (num == 0) {
                int result = 10 / num;
                System.out.println("Result: " + result);
            } else {
                System.out.println("No exception");
            }

        } catch (NullPointerException e) {
            System.out.println("java.lang.NullPointerException");

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }

        scanner.close();
    }
}