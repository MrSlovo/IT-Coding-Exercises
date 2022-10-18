import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 4.1
public class TourManager {
	// 4.2
	private Stop[] arrStop = new Stop[100];
	private int countStop = 0;

	// 4.3
	public TourManager() {
		try {
			Scanner scFile = new Scanner(new File("./data.txt"));

			while (scFile.hasNextLine()) {
				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(",");

				String stopName = scLine.next();
				int stopType = scLine.nextInt();
				String routeCodes = scLine.next();

				Stop stop = new Stop(stopName, routeCodes, stopType);
				
				arrStop[countStop] = stop;
				countStop++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.out.println(e);
		}
	}

	// 4.4
	public Route getRouteWithCode(char routeCode, boolean isCircular) {
		Route route = new Route(routeCode, isCircular);

		Stop[] routeStops = new Stop[100];
		int countRouteStops = 0;

		for (int i = 0; i < countStop; i++) {
			Stop s = arrStop[i];
			if (s.isPartOfRoute(routeCode)) {
				routeStops[countRouteStops] = s;
				countRouteStops++;
			}
		}

		route.setStops(routeStops);

		return route;
	}

	// 7.1
	public String getCommonStops(Route r1, Route r2) {
		Stop[] r1Stops = r1.get
		for (int i = 0; i < r1.get)
	}
}
