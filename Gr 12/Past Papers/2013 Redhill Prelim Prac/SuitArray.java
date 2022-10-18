import java.io.File;
import java.util.Scanner;

public class SuitArray {
	private StandardSuit[] suitArr;
	private int size = 0;

	public SuitArray() {
		try {

			Scanner scFile = new Scanner(new File("./IronManArmory.txt"));

			while (scFile.hasNextLine()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				String id = scLine.next();
				String name = scLine.next();
				int health = scLine.nextInt();
				int power = scLine.nextInt();
				String book = scLine.next();

				System.out.println(power);

				if (scLine.hasNext()) {
					int strength = scLine.nextInt();
					suitArr[size] = new BattleSuit(id, name, health, power, book, strength);
				} else {
					suitArr[size] = new StandardSuit(id, name, health, power, book);
				}

				size++;
			}
		} catch (Exception e) {
			System.err.println("SHIT BROKE HOMIE");
			System.err.println(e);
		}
	}

	public String display() {
		String out = "ID\tName\tHealth\tPower\tBook\tStrength";

		for (int i = 0; i < size; i++) {
			if (suitArr[i] instanceof BattleSuit) {
				BattleSuit s = (BattleSuit) suitArr[i];
				out += s.getFID() + "\t" + s.getFName() + "\t" + s.getFHealth() + "\t" + s.getFPower() + "\t" + s.getFBook()
						+ "\t" + s.getFStrength() + "\n";
			} else {
				StandardSuit s = suitArr[i];
				out += s.getFID() + "\t" + s.getFName() + "\t" + s.getFHealth() + "\t" + s.getFPower() + "\t" + s.getFBook()
						+ "\n";
			}
		}

		return out;
	}

	public double avgPoints() {
		int totalPoints = 0;
		for (int i = 0; i < size; i++) {
			totalPoints += suitArr[i].calcPoints();
		}
		return Math.round(totalPoints / size * 100) / 100;
	}

	public void sortSuits() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (suitArr[i].getFPower() < suitArr[j].getFPower()) {
					StandardSuit temp = suitArr[i];
					suitArr[i] = suitArr[j];
					suitArr[j] = temp;
				}
			}
		}
	}

	public String strongest() {
		String out = "";

		int maxPower = 0;
		for (int i = 0; i < size; i++) {
			if (suitArr[i].getFPower() > maxPower) {
				maxPower = suitArr[i].getFPower();
			}
		}

		for (int i = 0; i < size; i++) {
			out += suitArr[i].toString();
		}

		return out;
	}
}
