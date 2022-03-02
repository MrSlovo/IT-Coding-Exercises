
public class Car extends Vehicle {

  private int numOfSeats;

  public Car(int numOfSeats, String licensePlate) {
    super(licensePlate);
    this.numOfSeats = numOfSeats;
  }

  public int getNumOfSeats() {
    return numOfSeats;
  }

  public void setNumOfSeats(int numOfSeats) {
    this.numOfSeats = numOfSeats;
  }

  @Override
  public String toString() {
    return "Number Of Seats: " + numOfSeats + "\n";
  }

  
}
