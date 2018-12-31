package h.l.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import h.l.pojo.User;

public class UserDaoImplTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		// 创建sqlSessionFactory
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		// 创建UserDao
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		// 调用UserDao方法
		User user = userDao.findUserById(5);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() throws Exception {
		// 创建UserDao
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		// 创建一个对象
		User user = new User();
		user.setContent("5000");
		// 调用UserDao方法
		userDao.insertUser(user);
	}
	@Test
	public void testDeleteUser() throws Exception {
		// 创建UserDao
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		// 调用UserDao方法
		userDao.deleteUser(18);
	}
	@Test
	public void testUpdateUser() throws Exception {
		// 创建UserDao
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = new User();
		user.setContent("江苏大学");
		user.setId(19);
		userDao.updateUser(user);
	}
}
