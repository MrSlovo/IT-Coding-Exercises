import javax.swing.JOptionPane;

public class ThreeWords {
    public static void main(String[] args) {
        String word1, word2, word3;
        
        word1 = JOptionPane.showInputDialog("Enter Word 1");
        word2 = JOptionPane.showInputDialog("Enter Word 2");
        word3 = JOptionPane.showInputDialog("Enter Word 3");
        
        int totalCharacters = 0;
        
        System.out.println(word1 + " has " + word1.length() + " characters in it");
        totalCharacters += word1.length();
        System.out.println("The Total Amount of Characters is: " + totalCharacters);
        
        System.out.println();
        System.out.println(word2 + " has " + word2.length() + " characters in it");
        totalCharacters += word2.length();
        System.out.println("The Total Amount of Characters is: " + totalCharacters);
        
        System.out.println();  
        System.out.println(word3 + " has " + word3.length() + " characters in it");
        totalCharacters += word3.length();
        System.out.println("The Total Amount of Characters is: " + totalCharacters);
    }
    
}