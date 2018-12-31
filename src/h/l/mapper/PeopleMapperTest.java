/**   
* @Title: PeopleMapperTest.java 
* @Package h.l.mapper 
* @Description: TODO
* @author HL
* @date 2018年11月17日 下午3:33:20 
* @version V1.0   
*/
package h.l.mapper;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import h.l.pojo.OneAndMore;
import h.l.pojo.Order;
import h.l.pojo.People;
import h.l.pojo.PeopleAndOrder;
import h.l.pojo.PeopleVo;

public class PeopleMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindPeopleById() throws Exception { // 根据id查询People
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
		People people = peopleMapper.findPeopleById(1);
		System.out.println(people);
	}
	@Test
	public void testFindPeopleVoById() throws Exception { // 根据id查询PeopleVo
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
		PeopleVo peopleVo = peopleMapper.findPeopleVoById(1);
		System.out.println(peopleVo.getId());
		System.out.println(peopleVo.getUsername());
		System.out.println(peopleVo.getPassword());
		System.out.println(peopleVo.getOrdername());
		System.out.println(peopleVo.getOrdercode());
	}
	@Test
	public void testFindOrderById() throws Exception { // 根据id查询Order
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
		Order order = peopleMapper.findOrderById(1);
		System.out.println(order);
	}
	@Test
	public void testFindPeopleAndOrderById() throws Exception { // 根据id查询
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
		PeopleAndOrder peopleAndOrder = peopleMapper.findpeopleAndOrderById(3);
		System.out.println(peopleAndOrder);
	}
	@Test
	public void testFindOneAndMoreById() throws Exception { // 根据id查询
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PeopleMapper peopleMapper = sqlSession.getMapper(PeopleMapper.class);
		OneAndMore oneAndMore = peopleMapper.findoneAndMoreById(2);
		System.out.println(oneAndMore);
	}
}
