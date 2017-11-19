package com.qingshixun.project.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.qingshixun.project.dao.UserDao;
import com.qingshixun.project.model.User;

public class TestAdd extends BaseTest{

	public static void main(String[] args) {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		// 获取session
		SqlSession sqlSession = sessionFactory.openSession();
		
		// 获取接口的实现
		UserDao mapper = sqlSession.getMapper(UserDao.class);
		User user = new User("李四", 28, "北京");
		mapper.addUser(user);
		sqlSession.commit();
		sqlSession.close();
	}
}
