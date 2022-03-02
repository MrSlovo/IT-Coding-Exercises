
import java.util.Scanner;

public class FriendArrUI {

  public static void main(String[] args) {
    FriendArray friendArray = new FriendArray();
    System.out.println(friendArray);
    friendArray.sortByName();
    System.out.println(friendArray);
    friendArray.sortByAge();
    System.out.println(friendArray);
    
    Scanner nameScan = new Scanner(System.in);
    Friend searchResult = friendArray.search(nameScan.next());
    String msg = searchResult == null ? "u actually thought u had friends, lol" : searchResult.toString();
    System.out.println(msg);
    nameScan.close();
  }
}
