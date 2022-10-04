
import java.time.LocalDate;

public class Delivery {

  private int deliveryID;
  private double latiude;
  private double longitude;
  private LocalDate deliveryDate;
  private Equipment[] equipmentArray = new Equipment[100];
  private String dangerLevel;
  private boolean isDelivered;

  public static String LEVEL_RED = "High Danger";
  public static String LEVEL_ORANGE = "Considerable Danger";
  public static String LEVEL_YELLOW = "Moderate Danger";
  public static String LEVEL_GREEN = "Minor Danger";
  public static String LEVEL_UNKNOWN = "Unknown Danger Level";

  public Delivery(int id, double lat, double lng, LocalDate dd, int dl, char d) {
    deliveryID = id;
    latiude = lat;
    longitude = lng;
    deliveryDate = dd;
    switch (dl) {
      case 1 :
        dangerLevel = LEVEL_GREEN;
        break;
      case 2 :
        dangerLevel = LEVEL_YELLOW;
        break;
      case 3 :
        dangerLevel = LEVEL_ORANGE;
        break;
      case 4 :
        dangerLevel = LEVEL_RED;
        break;
      default:
        dangerLevel = LEVEL_UNKNOWN;
        break;
    }
    isDelivered = Character.toLowerCase(d) == 't';
  }

  public int getID() {
    return deliveryID;
  }

  public double getLatiude() {
    return latiude;
  }

  public double getLongitude() {
    return longitude;
  }

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public String getDangerLevel() {
    return dangerLevel;
  }

  public boolean getIsDelivered() {
    return isDelivered;
  }

  public void setEquipmentArray(Equipment[] equipArr) {
    equipmentArray = equipArr;
  }
  
  public void setDangerLevel(String dl) {
    
  }

  @Override
  public String toString() {
    return "(" + deliveryID + ") " + deliveryDate.toString() + " at " + latiude + "," + longitude + " in a " + getDangerLevel() + " - " + isDelivered;
  }
  
}
