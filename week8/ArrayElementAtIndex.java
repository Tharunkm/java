package week8;
import java.util.Scanner;

public class ArrayElementAtIndex {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Input size of the array
            System.out.print("Enter the size of the array: ");
            int size = Integer.parseInt(scanner.nextLine());

            // Input elements of the array
            int[] array = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                System.out.print("Element at index " + i + ": ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            // Input index
            System.out.print("Enter the index to retrieve the element: ");
            int index = Integer.parseInt(scanner.nextLine());

            // Print the element at the specified index
            System.out.println("Element at index " + index + ": " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index is out of range.");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter a valid integer.");
        }
    }
}
