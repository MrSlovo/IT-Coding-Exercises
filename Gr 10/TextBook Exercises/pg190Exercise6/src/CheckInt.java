
import javax.swing.JOptionPane;

public class CheckInt {
    public static void main(String[] args) {
        int num, input;
        do {
            // Input number abd users chosen opperation
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
            num = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1: Check if it is positive\n"
                    + "2: Check if it is even\n"
                    + "3: Check if it is a perfecr square\n"
                    + "4: Check if it is a multiple of 7\n"
                    + "5: Exit"));
            
            
            switch (num) {
                case 1:
                    // Output true if num is positive
                    System.out.println("Num is Positive: " + (input > -1));
                    break;
                case 2:
                    // Output true if num is even
                    System.out.println("Num is Even: " + (input % 2 == 0));
                    break;
                case 3:
                    // Output true if num is perfect square
                    System.out.println("Num is Perfect Square: " + (Math.sqrt(input) % 1 == 0));
                    break;
                case 4:
                    // Output true if num is multiple of 7
                    System.out.println("Num is Multiple of 7: " + (input % 7 == 0));
                    break;
                default:
                    break;
            }
            
        } while (num != 5); 
    }
}
