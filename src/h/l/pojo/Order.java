/**   
* @Title: Order.java 
* @Package h.l.pojo 
* @Description: TODO
* @author HL
* @date 2018年11月18日 下午4:13:39 
* @version V1.0   
*/
package h.l.pojo;

public class Order {// 订单类

	private int id;// 订单id
	private String orderName;// 订单名称
	private String orderCode;// 订单号
	private int peopleId;// 用户id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public int getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}
	public Order(int id, String orderName, String orderCode, int peopleId) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderCode = orderCode;
		this.peopleId = peopleId;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", orderCode="
				+ orderCode + ", peopleId=" + peopleId + "]";
	}

}
