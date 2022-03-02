
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Type: \n"
                + "'0' for Rock \n"
                + "'1' for paper \n"
                + "'2' for Rock"
            );
        int userMove = scan.nextInt();
        int computerMove = (int)Math.round(Math.random() * 2);
        
        int result = computerMove - userMove;
        String msg = "";
        
        switch (result) {
            case 1: case -2:
                msg = "Computer Won";
                break;
            case -1: case 2:
                msg = "Player Won";
                break;
            default: 
                msg = "Draw";
        }
        
        System.out.println(msg);
        
    }
}
