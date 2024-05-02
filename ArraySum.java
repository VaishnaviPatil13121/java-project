import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        array = new int[size];

        // Initialize the array
        System.out.println("Enter " + size + " integers:");

        try {
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Calculate the sum of the array
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("Sum of the array: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        }

        scanner.close();
    }
}