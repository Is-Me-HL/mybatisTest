/**   
* @Title: UserMapperTest.java 
* @Package h.l.mapper 
* @Description: TODO
* @author HL
* @date 2018年11月15日 上午11:04:32 
* @version V1.0   
*/
package h.l.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import h.l.pojo.User;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setContent("北疆");
		user.setId(20);
		userMapper.insertUser(user);
		sqlSession.commit();
		sqlSession.close();

	}
	@Test
	public void testUpdateUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setContent("河北");
		user.setId(20);
		userMapper.updateUser(user);
		sqlSession.commit();
		sqlSession.close();

	}
	@Test
	public void testDeleteUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.deleteUser(20);
		sqlSession.commit();
		sqlSession.close();

	}
	@Test
	public void testFindUserByName() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> user = userMapper.findUserByName("小哥哥");
		System.out.println(user);
	}
}
