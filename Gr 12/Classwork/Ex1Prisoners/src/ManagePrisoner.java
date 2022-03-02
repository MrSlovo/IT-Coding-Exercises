
import java.io.File;
import java.util.Scanner;

public class ManagePrisoner {

  private Prisoner convict[] = new Prisoner[100];
  private int size = 0;

  public ManagePrisoner() {
    try {
      Scanner scFile = new Scanner(new File("Prisoners.txt"));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.next()).useDelimiter("#");
        String name = scLine.next();
        int months = scLine.nextInt();
        char block = scLine.next().charAt(0);
        Prisoner prisoner = new Prisoner(name, months, block);
        convict[size] = prisoner;
        size++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public int getPrisonerSentence(String name) {
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return -1;
      } else if (prisoner.getName().equals(name)) {
        return prisoner.getMonths();
      }
    }
    return -1;
  }

  public int totalA() {
    int totalMonths = 0;
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return totalMonths;
      } else if (prisoner.getBlock() == 'A') {
        totalMonths += prisoner.getMonths();
      }
    }
    return totalMonths;
  }

  public int totalX(char block) {
    int totalMonths = 0;
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return totalMonths;
      } else if (prisoner.getBlock() == block) {
        totalMonths += prisoner.getMonths();
      }
    }
    return totalMonths;
  }

  public String prisonersMoreThan20Months() {
    String output = "";
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return output;
      } else if (prisoner.getMonths() > 20) {
        output += prisoner.toString() + "\n";
      }
    }
    return output;
  }

  public String prisonersMoreThanXMonths(int minMonths) {
    String output = "";
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return output;
      } else if (prisoner.getMonths() > minMonths) {
        output += prisoner.toString() + "\n";
      }
    }
    return output;
  }

  public void sortName() {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (convict[i].getName().compareTo(convict[j].getName()) > 0) {
          Prisoner temp = convict[i];
          convict[i] = convict[j];
          convict[j] = temp;
        }
      }
    }
  }

  public boolean prisonerExist(String name) {
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return false;
      } else if (prisoner.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  public void sortMonths() {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (convict[i].getMonths() < convict[j].getMonths()) {
          Prisoner temp = convict[i];
          convict[i] = convict[j];
          convict[j] = temp;
        }
      }
    }
  }

  @Override

  public String toString() {
    String output = "BLOCK\tNAME\t(MONTHS)\n";
    for (Prisoner prisoner : convict) {
      if (prisoner == null) {
        return output;
      }
      output += prisoner.toString() + "\n";
    }
    return output;
  }

}
