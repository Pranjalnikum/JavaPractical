import java.util.Scanner;

public class switch_Ex{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1: Even or Odd");
        System.out.println("2: Find out cube if number is between 10 to 50");
        System.out.println("3: Check if the number is positive or negative");
        System.out.println("4: Calculate the account balance according to the ROI");
        System.out.println("Enter Your Choice ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                break;
            case 2:
                System.out.println("Enter a number between 10 and 50:");
                int number = scanner.nextInt();
                if (number >= 10 && number <= 50) {
                    int cube = number * number * number;
                    System.out.println("The cube of " + number + " is: " + cube);
                } else {
                    System.out.println("Number is not between 10 and 50.");
                }
                break;
            case 3:
                System.out.println("Enter a number:");
                int inputNum = scanner.nextInt();
                if (inputNum > 0) {
                    System.out.println("The number is positive.");
                } else if (inputNum < 0) {
                    System.out.println("The number is negative.");
                } else {
                    System.out.println("The number is zero.");
                }
                break;
            case 4:
                System.out.println("Enter name:");
                String name = scanner.next();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                System.out.println("Enter gender (male/female):");
                String gender = scanner.next();
                System.out.println("Enter principal amount:");
                double principal = scanner.nextDouble();
        
                double roi;
                if (age >= 60) {
                    if (gender.equalsIgnoreCase("male")) {
                        roi = 7.0;
                    } else if (gender.equalsIgnoreCase("female")) {
                        roi = 7.5;
                    } else {
                        System.out.println("Invalid gender input. Using default ROI.");
                        roi = 0; 
                    }
                } else if (age < 50) {
                    roi = 5.0;
                } else {
                    roi = 0; 
                }
        
                double balance = principal * (1 + roi / 100);
                System.out.println("Account balance after one year: " + balance);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
