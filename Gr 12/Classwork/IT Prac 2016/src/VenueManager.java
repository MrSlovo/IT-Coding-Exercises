
import java.io.*;
import java.util.Scanner;

public class VenueManager {

  private Wedding[] weddings = new Wedding[50];
  private BookingDay[] bookings = new BookingDay[30];

  public VenueManager(String fileName) {
    try {
      Scanner scFile = new Scanner(new FileReader(fileName));
      for (int i = 0; i < 50; i++) {
        String line = scFile.nextLine();

        Scanner scLine = new Scanner(line).useDelimiter("#");
        weddings[i] = new Wedding(scLine.next(),
          scLine.next(), scLine.next(), scLine.next(),
          scLine.nextInt());

      }
      scFile.close();
    } catch (Exception e) {
      System.out.println("File not found: " + e);
    }
  }

  public String listAllWeddings() {
    String output = "";
    for (int i = 0; i < weddings.length; i++) {
      output = output + weddings[i] + "\n";
    }
    return output;
  }

  public Wedding getWeddingsOnDay(String day, String venue) {
    Wedding wed = null;
    for (int i = 0; i < weddings.length; i++) {
      if (weddings[i].equals(day,
        venue)) {
        wed = weddings[i];
      }
    }
    return wed;
  }
}
