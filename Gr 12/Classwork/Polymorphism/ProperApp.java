import java.util.Arrays;

import javax.swing.JOptionPane;

public class ProperApp {
	public static void main(String[] args) {

		// Vehicle Array
		Vehicle[] vArr = new Vehicle[10];
		Car[] cArr = cArr = new Car[10];
		Truck[] tArr = new Truck[10];
		int vCount = 0, cCount = 0, tCount = 0;

		Vehicle obj;// Declare object as super class
		String licensePlate = JOptionPane.showInputDialog(
				"Enter Licence Plate.\nType STOP to exit");

		while (!licensePlate.equalsIgnoreCase("stop")) {
			char type = JOptionPane.showInputDialog("Choose type:\n"
					+ "T = Truck\n"
					+ "C = Car\n"
					+ "V = unknown vehicle").toUpperCase().charAt(0);

			switch (type) {
				case 'T':
					double maxTons = Double.parseDouble(
							JOptionPane.showInputDialog("Enter max tons"));
					obj = new Truck(licensePlate, maxTons);
					break;

				case 'C':
					int numOfSeats = Integer.parseInt(
							JOptionPane.showInputDialog("Enter number of Seats"));
					obj = new Car(licensePlate, numOfSeats);
					break;
				default:
					obj = new Vehicle(licensePlate);
			}

			// Add object to vehicle aray
			vArr[vCount] = obj;
			vCount++;

			if (obj instanceof Car) {
				cArr[cCount] = (Car) obj;
				cCount++;
			}

			if (obj instanceof Truck) {
				tArr[tCount] = (Truck) obj;
				tCount++;
			}

			// Print the object created
			System.out.println(obj);
			System.out.println("\n\n");
			// Print the arrays
			System.out.println(Arrays.toString(vArr));
			System.out.println("\n\n");
			System.out.println(Arrays.toString(cArr));
			System.out.println("\n\n");
			System.out.println(Arrays.toString(tArr));

			licensePlate = JOptionPane.showInputDialog(
					"Enter Licence Plate.\nType STOP to exit");
		}
	}
}