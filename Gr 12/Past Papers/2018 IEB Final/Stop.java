// 2.1
public class Stop {
	// 2.2
	private String stopName;
	private String routeCodes;
	private int stopType;

	// 2.3
	public static final int STOPTYPE_CAFE = 1;
	public static final int STOPTYPE_SHELTER = 2;
	public static final int STOPTYPE_EXPRESS = 3;
	public static final int STOPTYPE_OTHER = 4;

	// 2.4
	public Stop(String inStopName, String inRouteCodes, int inStopType) {
		this.stopName = inStopName;
		this.routeCodes = inRouteCodes;
		this.stopType = inStopType >= 1 && inStopType <= 3 ? inStopType : 4;
	}

	// 2.5
	public String getStopTypeName() {
		switch (stopType) {
			case STOPTYPE_CAFE:
				return "cafe";
			case STOPTYPE_SHELTER:
				return "shelter";
			case STOPTYPE_EXPRESS:
				return "express";
			default:
				return "other";
		}
	}

	// 2.6
	public boolean isPartOfRoute(char c) {
		for (int i = 0; i < routeCodes.length(); i++) {
			if (routeCodes.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}

	// 2.7
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getStopTypeName() + "\t" + stopName;
	}
}
