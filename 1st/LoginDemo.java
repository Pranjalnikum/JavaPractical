import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        // Assume some predefined username and password
        String correctUsername = "user";
        String correctPassword = "password";

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the entered username and password match the predefined ones
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password. Please try again.");
        }
    }
}
