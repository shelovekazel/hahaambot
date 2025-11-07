import javax.swing.*;

public class pld7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number to check if it's prime or composite:");
        
        // Convert input to integer
        int number = Integer.parseInt(input);
        
        // Initialize flag for prime checking
        boolean isPrime = true;
        
        // Check if number is less than or equal to 1
        if (number <= 1) {
            JOptionPane.showMessageDialog(null, number + " is neither prime nor composite");
            System.exit(0);
        }
        
        // Check for prime or composite
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Display result
        if (isPrime) {
            JOptionPane.showMessageDialog(null, number + " is a prime number");
        } else {
            JOptionPane.showMessageDialog(null, number + " is a composite number");
        }
    }
}