// 6.1
public class TourUI {
	public static void main(String[] args) {
		// 6.2
		TourManager tManager = new TourManager();

		// 6.3
		Route r1 = tManager.getRouteWithCode('R', true);
		Route r2 = tManager.getRouteWithCode('Y', false);

		// 6.4
		System.out.println(r1);
		System.out.println(r2);

		// 7.2
		System.out.println(tManager.getCommonStops(r1, r2));
	}

}
