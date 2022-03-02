
import java.util.Scanner;

public class SportingEvents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Year");
        int year = scan.nextInt();
        int yearsAfterLeap = year % 4;
            
        switch(yearsAfterLeap) {
            case 0: 
                System.out.println("Olympics");
                break;
            case 2: 
                System.out.println("Cricket");
                break;
            case 3: 
                System.out.println("Rugby");
                break;
            default:
                System.out.println("No sporting event");
        }
        
        scan.close();
    }
}
