import javax.swing.JOptionPane;

public class BMR {

    public static void main(String[] args) {

        // Declares all the needed variables
        double height, weight, bmr;
        int age;
        String msg;
        char gender;

        // Gets user input
        height = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Height In Inches"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Weight In Pounds"));
        gender = JOptionPane.showInputDialog("Please Enter Your Gender").toLowerCase().charAt(0);

        // Converts units to metric system
        height *= 2.54;
        weight /= 2.205;

        // Generates random age from 13 - 19;
        age = (int)(Math.floor(Math.random() * 7) + 13);

        // Calculates users BMR based on their gender
        if (gender == 'm') {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else {
            
            if (gender == 'f') {
                bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;    
            } else {
                System.out.println("\"Other\" has been input as gender");
                bmr = (10 * weight) + (6.25 * height) - (5 * age) - 158.5; 
            }
        }

        // Determine whether user is at risk
        if ((bmr < 5.5 && bmr > 15.5) || (age >= 13 && age <= 16)) {
            msg = "At risk";
        } else {
            msg = "Not at risk";
        }

        System.out.println(msg);

    }
}
