import java.util.Scanner;

public class IronManApp {
    public static void main(String[] args) {
        // Randomly generated ID
        int suitID = (int) (Math.random() * 10) + 1;

        // Inputing all variables
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter suit name: ");
        String suitName = scan.next(); 
        System.out.print("Enter suit health: ");
        int suitHealth = scan.nextInt();
        System.out.print("Enter suit power: ");
        int suitPower = scan.nextInt();

        // Instantiationg object
        IronMan ironMan = new IronMan(suitID, suitName, suitHealth, suitPower);

        // Print object
        System.out.println(ironMan.toString());
    }
}
