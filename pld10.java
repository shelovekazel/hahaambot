import javax.swing.*;

public class pld10{
    public static void main(String[] args) {
        // Initialize counters
        int totalGrades = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        int score;
        
        // Create a loop that continues until a negative number is entered
        while (true) {
            String input = JOptionPane.showInputDialog("Enter a score (Enter a negative number to end):");
            
            // Convert input to integer
            score = Integer.parseInt(input);
            
            // Check if sentinel value (negative number) is entered
            if (score < 0) {
                break;
            }
            
            // Increment total grades counter
            totalGrades++;
            
            // Categorize the score
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }
        
        // Prepare the output message
        String result = "Total number of grades = " + totalGrades + "\n" +
                       "Number of A's = " + countA + "\n" +
                       "Number of B's = " + countB + "\n" +
                       "Number of C's = " + countC + "\n" +
                       "Number of D's = " + countD + "\n" +
                       "Number of F's = " + countF;
        
        // Display the results
        JOptionPane.showMessageDialog(null, result);
    }
}