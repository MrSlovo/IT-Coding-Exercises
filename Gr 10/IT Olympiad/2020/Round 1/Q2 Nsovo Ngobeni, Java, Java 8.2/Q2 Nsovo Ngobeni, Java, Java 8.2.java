public class Main {

    public static void main(String[] args) {
        
        // Declare Variables
        int numberOfTiles  =  51;
        long wheat = 1;
        long wheatOnBlack = 0;
        
        // Adds the "wheat" variable to the "wheatOnBlack" variable if the number is odd
        for (int i = 1; i <= numberOfTiles; i++) {
            if (!(i % 2 == 0)) {
                wheatOnBlack += wheat;
            }
            wheat *= 2; 
        }
        
        // Displays Output
        System.out.println(wheatOnBlack);
    }
    
}
