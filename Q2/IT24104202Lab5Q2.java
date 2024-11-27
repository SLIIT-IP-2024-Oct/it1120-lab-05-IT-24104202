import java.util.Scanner;

public class IT24104202Lab5Q2 {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number of new members introduced
        System.out.print("Enter the number of new members you have introduced: ");
        int newMembers = scanner.nextInt();
        
        // Validate the input (should be >= 0)
        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members should be greater than or equal to 0.");
        } else {
            // Switch statement to determine the prize
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            
            // Output the prize
            System.out.println("Price is a: " + prize);
        }
        
        // Close the scanner
        scanner.close();
    }
}
