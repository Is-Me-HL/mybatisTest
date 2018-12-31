/**   
* @Title: PeopleAndOrder.java 
* @Package h.l.pojo 
* @Description: TODO
* @author HL
* @date 2018年11月18日 下午4:23:53 
* @version V1.0   
*/
package h.l.pojo;

public class PeopleAndOrder {// 该类测试的是多表联合一对对查询，是对Order类的扩充 一对一映射
	private int id;// 订单id
	private String orderName;// 订单名称
	private String orderCode;// 订单号
	private int peopleId;// 用户id
	// 上述四行代码都是Order表的内容
	private People people;// 该处加上用户的信息，就可以直接将people表和Order表的联合查询结果映射进来
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
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public PeopleAndOrder(int id, String orderName, String orderCode,
			int peopleId, People people) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderCode = orderCode;
		this.peopleId = peopleId;
		this.people = people;
	}
	public PeopleAndOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PeopleAndOrder [id=" + id + ", orderName=" + orderName
				+ ", orderCode=" + orderCode + ", peopleId=" + peopleId
				+ ", people=" + people + "]";
	}

}
