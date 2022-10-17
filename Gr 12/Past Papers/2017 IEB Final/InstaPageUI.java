import javax.swing.JOptionPane;

public class InstaPageUI {
	public static void main(String[] args) {
		// 5.1
		// String input = new JOptionPane().showInputDialog("Input i guess");
		// 5.2
		InstaPageManager pgManager = new InstaPageManager();
		// 5.3
		// System.out.println(pgManager.getAllPosts());
		System.out.println(pgManager.getPostWithResponses());
	}
}
