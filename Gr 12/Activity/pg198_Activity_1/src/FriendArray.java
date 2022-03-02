
import java.io.File;
import java.util.Scanner;

public class FriendArray {

  private Friend friendArr[] = new Friend[50];
  private int size = 0;

  public FriendArray() {
    try {
      Scanner scFile = new Scanner(new File("Friends.txt"));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.next()).useDelimiter("#");
        String name = scLine.next();
        String dob = scLine.next();

        friendArr[size] = new Friend(name, dob);
        size++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  
  public Friend search(String name) {
    for (Friend friendArr1 : friendArr) {
      if (name.equals(friendArr1.getName())) {
        return friendArr1;
      }
    }
    return null;
  }

  public void sortByName() {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (friendArr[i].getName().compareTo(friendArr[j].getName()) > 0) {
          Friend temp = friendArr[i];
          friendArr[i] = friendArr[j];
          friendArr[j] = temp;
        }
      }
    }
  }

  public void sortByAge() {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (friendArr[i].getAge() > friendArr[j].getAge()) {
          Friend temp = friendArr[i];
          friendArr[i] = friendArr[j];
          friendArr[j] = temp;
        }
      }
    }
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < size; i++) {
      output += friendArr[i] + "\n";
    }
    return output;
  }

}
