
import javax.swing.JOptionPane;

public class Greet {
    public static void main (String[]args)
    {
        char a;
         a = (JOptionPane.showInputDialog("A. Afrikaans \n B. Zulu \n C. English \n S.Sotho")).charAt(0);
        
        switch (a)
        {
            case 'A':
               System.out.println("Goeie more!");
               break;
            case 'B':
               System.out.println("Sawubona!");
               break;
            case 'C':
                System.out.println("Good day!");
                break;
            case 'S':
                System.out.println("Dumela!");
                break;
            default: System.out.println("Incorrect input, please enter a valid one.");
        }
    }
     
}
