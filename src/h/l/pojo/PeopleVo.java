/**   
* @Title: PeopleVo.java 
* @Package h.l.pojo 
* @Description: TODO
* @author HL
* @date 2018年11月17日 下午4:50:23 
* @version V1.0   
*/
package h.l.pojo;

public class PeopleVo extends People {// 查询tabletest1表和tabletest2表部分字段 一对一映射

	private String ordername;// 订单的名字
	private String ordercode;// 订单号
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrdercode() {
		return ordercode;
	}
	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}
	public PeopleVo(int id, String username, String password, String ordername,
			String ordercode) {
		super(id, username, password);
		this.ordername = ordername;
		this.ordercode = ordercode;
	}
	public PeopleVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PeopleVo(int id, String username, String password) {
		super(id, username, password);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PeopleVo [id=" + getId() + ",username=" + getUsername()
				+ ",password=" + getPassword() + ",ordername=" + ordername
				+ ", ordercode=" + ordercode + "]";
	}

}
