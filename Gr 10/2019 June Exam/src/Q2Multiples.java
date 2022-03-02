
import javax.swing.JOptionPane;

public class Q2Multiples {
    public static void main(String[] args) {
        // Declare variables
        int num, lastMultiple, mistakes = 0;
        String msg, multiples = "";
        
        // Gets user input        
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        lastMultiple = Integer.parseInt(JOptionPane.showInputDialog("Enter a second number\nWhich is a multiple of the first number"));
        
        // If user input is invalid user will be prompted to try again
        if (lastMultiple % num != 0) {
            // Re-assigns lastmultiple variable
            lastMultiple = Integer.parseInt(JOptionPane.showInputDialog( lastMultiple + " is not a multiple of " + num + "\nEnter another number"));
            
            // If input is invalid again program will end
            if (lastMultiple % num != 0) {
                System.out.println("Error. Invalid Input");
                System.exit(0);
            } else {
                // Generate Multiples
                multiples = generateMultiples(num, lastMultiple);
            }   
            
        } else {
            // Generate Multiples
            multiples = generateMultiples(num, lastMultiple);
        }
        
        // Prints out the output message
        System.out.println("The multiples of " + num + " between " + num + " and " + lastMultiple);
        System.out.println(multiples);
    }
    
    // Generates a string with all multiples of num until lastMultiple
    public static String generateMultiples(int num, int lastMultiple) {
        int currentNum = num;
        String multiples = "";
        while (currentNum <= lastMultiple) {
            multiples += currentNum + "\t";
            currentNum += num;
        }
        return multiples;
    }    
}
