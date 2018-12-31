/**   
* @Title: OneAndMore.java 
* @Package h.l.pojo 
* @Description: TODO
* @author HL
* @date 2018年11月18日 下午8:13:41 
* @version V1.0   
*/
package h.l.pojo;

import java.util.List;

public class OneAndMore {
	private int id;// 用户id
	private String username;// 用户名
	private String password;// 用户密码
	private List<Order> orderList;// 订单
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
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public OneAndMore(int id, String username, String password,
			List<Order> orderList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.orderList = orderList;
	}
	public OneAndMore() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OneAndMore [id=" + id + ", username=" + username + ", password="
				+ password + ", orderList=" + orderList + "]";
	}
	
}
