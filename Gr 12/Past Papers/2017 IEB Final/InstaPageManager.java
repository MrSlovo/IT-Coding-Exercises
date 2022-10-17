import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 4.1
public class InstaPageManager {
	// 4.2
	private Post[] arrPost = new Post[100];
	private int postCount = 0;
	private Response[] arrResponse = new Response[500];
	private int responseCount = 0;

	// 4.3
	public InstaPageManager() {
		try {
			Scanner scFile = new Scanner(new File("./data.txt"));

			while (scFile.hasNextLine()) {

				Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");

				int id = scLine.nextInt();
				String user = scLine.next();
				String content = scLine.next();
				String dateTime = scLine.next();

				if (scLine.hasNext()) {
					int responseType = scLine.nextInt();
					arrResponse[responseCount] = new Response(id, user, content, dateTime, responseType);
					responseCount++;
				} else {
					arrPost[postCount] = new Post(id, user, content, dateTime);
					postCount++;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	// 4.4
	public String getAllPosts() {
		String output = "";
		for (Post post : arrPost) {
			output += post + "\n";
		}
		return output;
	}

	// 4.5
	public String getPostWithResponses() {
		String out = "";

		PostWithResponses[] arrPostWithResponses = new PostWithResponses[100];
		int count = 0;

		for (int i = 0; i < postCount; i++) {
			Post post = arrPost[i];

			Response[] r = new Response[500];
			int rCount = 0;
			for (int j = 0; j < responseCount ; j++) {
				if (arrResponse[j].getPostID() == post.getPostID()) {
					r[rCount] = arrResponse[j];
					rCount++;
				}
			}

			PostWithResponses p = new PostWithResponses(post, r);
			arrPostWithResponses[count] = p;
			count++;
		}

		for (int i = 0; i < count; i++) {
			out += arrPostWithResponses[i].toString();
		}

		return out;
	}
}
