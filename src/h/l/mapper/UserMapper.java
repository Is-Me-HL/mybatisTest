/**   
* @Title: UserMapper.java 
* @Package h.l.mapper 
* @Description: TODO
* @author HL
* @date 2018年11月15日 上午10:57:30 
* @version V1.0   
*/
package h.l.mapper;

import java.util.List;
import java.util.Map;

import h.l.pojo.User;

public interface UserMapper {

	public User findUserById(int id) throws Exception;// 根据id查询用户

	public void insertUser(User user) throws Exception;// 新增用户

	public void deleteUser(int id) throws Exception;// 删除用户

	public void updateUser(User user) throws Exception;// 更新用户

	public List<User> findUserByName(String name) throws Exception;// 根据用户名查询用户列表

	public Map<Integer, String> finfUserByMapKey(int id) throws Exception;// 根据map的key查询map
}
