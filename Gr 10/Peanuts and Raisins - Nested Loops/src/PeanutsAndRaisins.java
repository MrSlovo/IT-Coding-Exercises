import java.util.ArrayList;
 
public class PeanutsAndRaisins {
  public static void main(String[] args) {
 
    // Creates an array that will contain arrays which themselves both peanuts(p) and raisins(r)
    char[][] bagArray = new char[][] {
      { 'p', 'p', 'r' },
      { 'p', 'r', 'r' },
      { 'r', 'p', 'p' },
      { 'p', 'p', 'r' },
      { 'r', 'p', 'p' },
      { 'p', 'r', 'r' },
      { 'p', 'p', 'r' },
      { 'r', 'r', 'p' },
      { 'r', 'r', 'p' },
    };
 
    // All the peanuts and raisins will be sorted in these arrays respectively
    ArrayList<Character> peanutsBag = new ArrayList<>();
    ArrayList<Character> raisinsBag = new ArrayList<>();
 
    // Algorithm to sort bags
    for (char[] bag : bagArray) {
        for (char item : bag) {
            if (item == 'p') {
                peanutsBag.add('p');
            } else {
                raisinsBag.add('r');
            }
        }
    }
 
    // Outputs Sorted Bag
    System.out.println("Peanuts: " + peanutsBag);
    System.out.println("Raisins: " + raisinsBag); 
  }
}
