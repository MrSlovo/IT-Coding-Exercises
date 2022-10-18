// 3.1
public class Route {
	private char routeCode;
	private boolean isCircular;
	private Stop[] stops;

	// 3.2
	public Route(char routeCode, boolean isCircular) {
		this.routeCode = routeCode;
		this.isCircular = isCircular;
	}

	// 3.3
	public void setStops(Stop[] s) {
		this.stops = s;
	}

	// 3.4
	public char getRouteCode() {
		return routeCode;
	}

	// 3.5
	public Stop getStopAt(int num) {
		try {
			return stops[num];
		} catch (Exception e) {
			return null;
		}
	}

	// TODO: ToString method to be added in question 5
	@Override
	public String toString() {
		String out = "";
		if (!(stops.length > 0)) {
			// Empty Route
			out = routeCode + " - Invalid";
			return out;
		} else if (isCircular) {
			// Circular Route
			out = routeCode + " - Circular";
			int sCount = 0;
			for (Stop s : stops) {
				out += "-> " + sCount + " " + s.toString();
				sCount++;
			}
			out += "-> " + 1 + " " + stops[0];
		} else if (!isCircular) {
			// Linear Route
			out = routeCode + " - Linear";
			for (int i = 0; i < stops.length; i++) {
				out += "-> " + i + " " + stops[i].toString();
			}
			for (int i = stops.length - 1; i >= 0; i--) {
				out += "-> " + 1 + " " + stops[i].toString();
			}
			return out;
		}
		return out;
	}
}