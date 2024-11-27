import java.util.Scanner;

public class IT24104202Lab5Q3 {
    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;
    public static final int MAX_DAYS_IN_MONTH = 31;
    
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input the start and end dates
        System.out.print("Enter the start date of the reservation (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date of the reservation (1-31): ");
        int endDate = scanner.nextInt();
        
        // Validation 1: Start and end dates must be between 1 and 31
        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return; // Exit the program if validation fails
        }
        
        // Validation 2: Start date must be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program if validation fails
        }
        
        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;
        
        // Calculate the discount rate based on the number of days reserved
        int discountRate = 0;
        if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discountRate = DISCOUNT_3_4_DAYS;
        }
        
        // Calculate the total amount to be paid
        int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        int discountAmount = (totalAmount * discountRate) / 100;
        int finalAmount = totalAmount - discountAmount;
        
        // Output the results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + finalAmount);
        
        // Close the scanner
        scanner.close();
    }
}
