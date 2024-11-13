
// check online payment segment for an online payment Trnsaction

import java.util.Scanner;

public class Paymentsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();

        System.out.println("Processing payment...");
        // Simulate payment processing
        boolean paymentSuccessful = processPayment(amount);

        if (paymentSuccessful) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed.");
        }

        scanner.close();
    }

    private static boolean processPayment(double amount) {
        
        // Simulate payment processing logic
        // In a real scenario, this method would interact with a payment gateway or process the payment internally
       
        return amount > 0;
    }
}
