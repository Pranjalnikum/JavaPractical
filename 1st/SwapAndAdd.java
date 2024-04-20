import java.util.Scanner;

public class SwapAndAdd{
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Swap the values of the variables
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Calculate the sum of the swapped values
        int sum = num1 + num2;

        // Print the sum
        System.out.println("Sum of the swapped numbers: " + sum);
    }
}
