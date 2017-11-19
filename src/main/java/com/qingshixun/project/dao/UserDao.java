package com.qingshixun.project.dao;

import java.util.List;

import com.qingshixun.project.model.User;

public interface UserDao {

	public User findById(int id);
	
	public List<User> findAll();
	
	public void updateUser(User user);
	
	public void addUser(User user);
	
	public void deleteUser(int id);
		
}
