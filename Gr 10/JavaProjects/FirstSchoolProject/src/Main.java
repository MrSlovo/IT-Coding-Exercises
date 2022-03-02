
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(greet(scanner.nextInt()));
    }
    public static String greet(int num) {
        String greetingMessage = "";
        
        if (num == 1) {
            greetingMessage = "Yo";
        }
        else if (num == 2) {
            greetingMessage = "Awe";
        }
        else if (num == 3) {
            greetingMessage = "Hello";
        }
        
        return greetingMessage;
    }
        
   
    
}