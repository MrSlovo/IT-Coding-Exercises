public class Response {
	private int postID;
	private String user;
	private String comment;
	private String responseDateTime;
	private int responseType;

	public static final int RESPONE_LIKE = 1;
	public static final int RESPONE_COMMENT = 2;
	public static final int RESPONE_DISLIKE = 3;
	public static final int RESPONE_LOVE = 4;

	public Response(int inPostID, String inUser, String inComment, String inResponseDateTine, int inResponseType) {
		this.postID = inPostID;
		this.user = inUser;
		this.comment = inComment;
		this.responseDateTime = inResponseDateTine;
		this.responseType = inResponseType;
	}

	private String getReactionType() {
		switch (responseType) {
			case RESPONE_LIKE:
				return "like";
			case RESPONE_COMMENT:
				return "commented";
			case RESPONE_DISLIKE:
				return "disliked";
			case RESPONE_LOVE:
				return "loved";
			default:
				return "";
		}
	}

	public int getPostID() {
		return this.postID;
	}

	@Override
	public String toString() {
		if (responseType == RESPONE_COMMENT) {
			return responseDateTime + "\t" + user + " " + getReactionType() + " on this post: " + comment;
		} else {
			return responseDateTime + "\t" + user + " " + getReactionType() + " this post";
		}
	}
}
