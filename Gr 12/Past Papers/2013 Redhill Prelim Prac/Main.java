public class Main {
	public static void main(String[] args) {
		SuitArray s = new SuitArray();

		System.out.println(s.display());
		System.out.println("\n\n\n");

		System.out.println(s.avgPoints());
		System.out.println("\n\n\n");

		s.sortSuits();
		System.out.println(s.display());
		System.out.println("\n\n\n");

		System.out.println(s.strongest());

		
	}
}
