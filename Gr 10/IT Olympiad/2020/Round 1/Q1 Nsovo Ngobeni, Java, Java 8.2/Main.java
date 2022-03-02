public class Main {
    public static void main(String[] args) {
        
        // Declares variables
        int chickens, cows, bees;
        int totalLegs = 0;
        
        // Innit Variables
        chickens = 8330;
        cows = 1450;
        bees = 3957;        
        
        // Increments the number of legs
        for (int i = 0; i < chickens; i++) {
            totalLegs +=  2;
        }
        for (int i = 0; i < cows; i++) {
            totalLegs += 4;
        }
        for (int i = 0; i < bees; i++) {
            totalLegs += 6;
        }
                
        // Display Output
        System.out.println(totalLegs);
    }    
}
