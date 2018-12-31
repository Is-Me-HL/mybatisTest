/**   
* @Title: PeopleMapper.java 
* @Package h.l.mapper 
* @Description: TODO
* @author HL
* @date 2018年11月17日 下午2:41:06 
* @version V1.0   
*/
package h.l.mapper;

import h.l.pojo.OneAndMore;
import h.l.pojo.Order;
import h.l.pojo.People;
import h.l.pojo.PeopleAndOrder;
import h.l.pojo.PeopleVo;

public interface PeopleMapper {

	public People findPeopleById(int id) throws Exception; // 根据people的ID查询people

	public PeopleVo findPeopleVoById(int id) throws Exception; // 根据PeopleVo的id查询PeopleVo

	public Order findOrderById(int id) throws Exception; // 根据Order的id查询Order

	public PeopleAndOrder findpeopleAndOrderById(int id) throws Exception; // 根据order的id查询PeopleAndOrder

	public OneAndMore findoneAndMoreById(int id) throws Exception; // 根据order的id查询OneAndMore
}
