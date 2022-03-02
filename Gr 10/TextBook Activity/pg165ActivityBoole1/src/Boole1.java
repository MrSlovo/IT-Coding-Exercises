
import java.util.Scanner;

public class Boole1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year;
        boolean leap;
        
        year = scan.nextInt();
        
        leap = year % 4 == 0;
        
        if (leap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
