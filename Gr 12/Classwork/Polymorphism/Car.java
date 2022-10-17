//subClass extends superClass
// makes the superClass the super in this class
public class Car extends Vehicle {
	private int numberOfSeats;

	public Car(String licensePlate, int numberOfSeats) {
		// use super() to call the constructor of super class
		// Vehicle obj = new Vehicle(licensePlate)
		super(licensePlate); // must be the very first statement
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNumber of seats: " + numberOfSeats;
	}
}