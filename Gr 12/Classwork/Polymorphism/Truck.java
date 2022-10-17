public class Truck extends Vehicle {
	private double maxTon;

	public Truck(String licensePlate, double maxTon) {
		super(licensePlate);
		this.setMaxTon(maxTon);
	}

	public double getMaxTon() {
		return maxTon;
	}

	public void setMaxTon(double maxTon) {
		this.maxTon = maxTon;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMaximum Tons:\t" + maxTon;
	}
}