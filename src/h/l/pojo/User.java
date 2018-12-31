package h.l.pojo;

public class User {

	private int id;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", content=" + content + "]";
	}
	public User(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
