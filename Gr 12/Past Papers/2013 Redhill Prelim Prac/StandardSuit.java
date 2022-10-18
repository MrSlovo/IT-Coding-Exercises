public class StandardSuit {
	private String fID;
	private String fName;
	private int fHealth;
	private int fPower;
	private String fBook;

	public StandardSuit(String fID, String fName, int fHealth, int fPower, String fBook) {
		this.fID = fID;
		this.fName = fName;
		this.fHealth = fHealth;
		this.fPower = fPower;
		this.fBook = fBook;
	}

	public void setFBook(String fBook) {
		String validID = "";

		// Change to uppercase
		fBook = fBook.toUpperCase();

		// Remove non-alphabetical
		for (String s : fBook.split("")) {
			if (Character.isAlphabetic(s.charAt(0))) {
				validID += s;
			}
		}

		// Change length
		if (validID.length() == 4) {
			this.fBook = validID;
		} else if (validID.length() > 4) {
			this.fBook = validID.substring(0, 5);
		} else if (fBook.length() < 4) {
			this.fBook = (fBook + "XXXX").substring(0, 5);
		}

		this.fBook = fBook;
	}

	public int calcPoints() {
		return (int) Math.round(Math.sqrt(10 * ((fHealth + fPower) / 2)));
	}

	// Getters and Setters
	public String getFID() {
		return this.fID;
	}

	public void setFID(String fID) {
		this.fID = fID;
	}

	public String getFName() {
		return this.fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public int getFHealth() {
		return this.fHealth;
	}

	public void setFHealth(int fHealth) {
		this.fHealth = fHealth;
	}

	public int getFPower() {
		return this.fPower;
	}

	public void setFPower(int fPower) {
		this.fPower = fPower;
	}

	public String getFBook() {
		return this.fBook;
	}

	@Override
	public String toString() {
		return fID + "\t" + fName + "\t" + fHealth + "\t" + fPower + "\t" + fBook;
	}
}
