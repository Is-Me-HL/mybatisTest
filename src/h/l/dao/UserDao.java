/**   
* @Title: UserDao.java 
* @Package h.l.dao 
* @Description: TODO
* @author HL
* @date 2018年11月14日 上午11:26:04 
* @version V1.0   
*/
package h.l.dao;

import h.l.pojo.User;

public interface UserDao {

	public User findUserById(int id) throws Exception;// 根据id查询查询用户

	public void insertUser(User user) throws Exception;// 新增用户

	public void deleteUser(int id) throws Exception;// 删除用户

	public void updateUser(User user) throws Exception;// 更新用户
	
}
