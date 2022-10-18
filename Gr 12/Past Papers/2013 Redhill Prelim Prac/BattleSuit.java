public class BattleSuit extends StandardSuit {
	private int fStrength;

	public BattleSuit(String fID, String fName, int fHealth, int fPower, String fBook, int fStrength) {
		super(fID, fName, fHealth, fPower, fBook);
		this.fStrength = fStrength;
	}

	public int calcPoints() {
		if (super.getFHealth() > 50) {
			return (int) Math.round(Math.sqrt(fStrength * ((super.getFHealth() + super.getFPower()) / 2)));
		} else {
			return super.calcPoints();
		}
	}

	public int getFStrength() {
		return this.fStrength;
	}

	public void setFStrength(int fStrength) {
		this.fStrength = fStrength;
	}

	@Override
	public String toString() {
		return getFID() + "\t" + getFName() + "\t" + getFHealth() + "\t" + getFPower() + "\t" + getFBook() + "\t"
				+ fStrength;
	}
}
