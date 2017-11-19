package com.qingshixun.project.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.qingshixun.project.dao.UserDao;
import com.qingshixun.project.model.User;

public class TestDelete extends BaseTest{
	public static void main(String[] args) {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		// 获取session
		SqlSession sqlSession = sessionFactory.openSession();
		// 获取接口的实现
		UserDao mapper = sqlSession.getMapper(UserDao.class);

		mapper.deleteUser(3);
		
		// 关闭session
		sqlSession.commit();
		sqlSession.close();
	}
}
