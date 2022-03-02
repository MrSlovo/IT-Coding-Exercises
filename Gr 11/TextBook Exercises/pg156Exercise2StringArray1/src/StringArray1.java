public class StringArray1 {
  public static void main(String[] args) {
    String nameArr[] = {"Nsovo", "Eoin", "Olivier", "Murray", "5thName", "6th", "7th", "8th", "9th", "10th", "11th", "12th"};
    String longestName = "";
    
    // 2.1 Displays names more than 6 characters long
    for (String name : nameArr) {
      if(name.length() > 6) {
        System.out.print(name + " ");
      }
    }
    
    
    // 2.2 Display the longest name
    for (String name : nameArr) {
      if (name.length() > longestName.length()) {
        longestName = name;
      }
    }
    System.out.println("Longest name: " + longestName);
  }
}
