// 6.1
public class PostWithResponses {
	// 6.2
	private Post post;
	private Response[] arrResponses = new Response[500];

	// 6.3
	public PostWithResponses(Post post, Response[] arrResponses) {
		this.post = post;
		this.arrResponses = arrResponses;
	}

	// 6.4
	@Override
	public String toString() {
		String out = post + "\n" + "\tRespones:" + "\n";
		for (Response response : arrResponses) {
			if (response == null) {
				return out;
			}
			out += "\t\t" + response + "\n";
		}
		return out;
	}
}
