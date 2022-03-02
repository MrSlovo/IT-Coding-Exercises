
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char opperation =  scan.next().toLowerCase().charAt(0);
        double result = 0;
        String msg;
        
        switch (opperation) {
            case 'a':
                result = num1 + num2;
                msg = num1 + " +"
                        + " " + num2 + " = " + result;
                break;
            case 's':
                result = Math.abs(num1 - num2);
                msg = num1 + " - " + num2 + " = " + result;
                break;
            case 'd':
                result = num1 / num2;
                msg = num1 + " / " + num2 + " = " + result;
                if (num2 == 0) {
                    msg = "Cannot divide by 0";
                }
                break;
            case 'm':
                result = num1 * num2; 
                msg = num1 + " x " + num2 + " = " + result;
                break;
            case 'x': 
                msg = "Exiting";
            default: 
                msg = "Error. Incorrect Input";
        }
        
        System.out.println(msg);
        
        scan.close();
    }
}
