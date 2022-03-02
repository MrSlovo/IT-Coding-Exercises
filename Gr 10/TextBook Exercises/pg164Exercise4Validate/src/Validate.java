
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Year");
        int year = scan.nextInt();
        
        System.out.println("Enter Month");
        String month = scan.next();
        
        System.out.println("Enter Day");
        int day = scan.nextInt();
        
        String msg;
        
        switch(month) {
            case "Jan":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Feb":
                if ((day <= 28) || (day <= 29 && year % 4 == 0)) {
                    System.out.println("Date is Valid");
                } else {
                    System.out.println("Date is Invalid");
                }
                break;
            case "Mar":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Apr":
                if (day <= 30) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "May":
                if (day <= 31) {
                    System.out.println("Date is Valid");
                } else {
                    System.out.println("Date is Invalid");
                }
                break;
            case "June":
                if (day <= 30) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "July":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Aug":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Sep":
                if (day <= 30) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Oct":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Nov":
                if (day <= 30) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            case "Dec":
                if (day <= 31) {
                    msg = "Date is Valid";
                } else {
                    msg = "Date is Invalid";
                }
                break;
            default:
                msg = "Invalid Input";
        }
        
        scan.close();
    }
}
