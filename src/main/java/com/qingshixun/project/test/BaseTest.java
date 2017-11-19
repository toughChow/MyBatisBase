package com.qingshixun.project.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseTest {

	//mybatis 会话工厂
	private static SqlSessionFactory sqlSessionFactory;
	
	// reader
	private static Reader reader;

	static{
		
		try {
			// 读取配置文件
			reader = Resources.getResourceAsReader("configuration.xml");
			
			// 根据配置信息产生 MyBatis 会话工厂
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 得到会话工厂
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
