public class Flight {
	private String code;
	private String origin;
	private String destination;
	private DateTime depatureTime;
	private DateTime arrivalTime;
	private double cost;

	public Flight(String cde, String orig, String dest, DateTime dtime, DateTime atime, Double cst) {
		this.code = cde;
		this.origin = orig;
		this.destination = dest;
		this.depatureTime = dtime;
		this.arrivalTime = atime;
		this.cost = cst;
	}

	public String getCode() {
		return code;
	}

	public DateTime getDepartureTime() {
		return depatureTime;
	}

	public Double getCost() {
		return cost;
	}
}
