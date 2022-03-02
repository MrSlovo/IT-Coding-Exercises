
import javax.swing.JOptionPane;

public class NumberOfDigits {
    public static void main (String[] args) {
        
        String userInput = JOptionPane.showInputDialog("enter a number");
        int lengthOfNumber = userInput.length();
        
        System.out.println("Your Number " + userInput + " has "   + userInput.length() + " Digits in it");
        
        int wholeNum = Integer.parseInt(userInput);
        
//      wholeNum.length();
//      You cannot do this because .length() is a method of the String class and will not work on any other class       
        
    }
    
    
}
