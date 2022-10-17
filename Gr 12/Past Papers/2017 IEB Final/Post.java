// 2.1
public class Post {
	// 2.2
	private int id;
	private String user;
	private String postContent;
	private String postDateTime;

	// 2.3
	public Post(int inID, String inPostUser, String inPostContent, String inPostDateTime) {
		this.id = inID;
		this.user = inPostUser;
		this.postContent = inPostContent;
		this.postDateTime = inPostDateTime;
	}

	// 2.4
	public int getPostID() {
		return id;
	}

	// 2.5
	@Override
	public String toString() {
		return postDateTime + " " + user + " posted: " + postContent;
	}

}
