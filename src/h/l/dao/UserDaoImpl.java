package h.l.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import h.l.pojo.User;

public class UserDaoImpl implements UserDao {

	// 向dao实现类中注入SqlSessionFactory
	// 这里通过构造函数向实现类中注入SqlSessionFactory
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	// 因为SqlSession是线程不安全的，所有SqlSession对象应该在方法中创建，不能在类中创建
	// 根据id查找用户
	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		// 释放资源
		sqlSession.close();
		return user;
	}
	// 新增用户
	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
		sqlSession.close();
	}
	// 删除用户
	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("test.deleteUser", id);
		sqlSession.commit();
		sqlSession.close();
	}
	// 更新用户
	@Override
	public void updateUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("test.updateUser", user);
		sqlSession.commit();
		sqlSession.close();
	}

}
