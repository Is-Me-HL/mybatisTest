/**   
* @Title: Order.java 
* @Package h.l.pojo 
* @Description: TODO
* @author HL
* @date 2018年11月17日 下午2:29:20 
* @version V1.0   
*/
package h.l.pojo;

public class People {//用户类

	private int id;// 用户id
	private String username;// 用户名
	private String password;// 用户密码
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public People(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
}
