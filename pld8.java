import javax.swing.JOptionPane;

public class pld8   {
    public static void main(String[] args) {
        // Get first number from user
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        int num1 = Integer.parseInt(input1);
        
        // Get second number from user
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        int num2 = Integer.parseInt(input2);
        
        // Calculate GCD using Euclidean algorithm
        int gcd = calculateGCD(num1, num2);
        
        // Display result
        JOptionPane.showMessageDialog(null, 
            "The Greatest Common Divisor of " + num1 + " and " + num2 + " is: " + gcd);
        
        // Exit program
        System.exit(0);
    }
    
    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // Make sure we're working with positive numbers
        a = Math.abs(a);
        b = Math.abs(b);
        
        // Loop until we find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}