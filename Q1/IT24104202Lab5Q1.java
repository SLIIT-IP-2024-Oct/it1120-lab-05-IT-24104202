import java.util.Scanner;

public class IT24104202Lab5Q1 {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        // Compute the largest and smallest values
        int largest = num1;
        int smallest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Output the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        
        // Close the scanner
        scanner.close();
    }
}
