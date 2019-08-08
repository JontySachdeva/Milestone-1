package com.stock.dao;

import java.util.List;

import com.stock.model.User;

public interface UserDao {
	
	public int addOrUpdateUser(User userData,int index);
	public User getUser(String username, String password);
	public List<User> usersList();
	public User getUserByIdOrUsername(int id,String username);
	public boolean deleteUserByIdOrUsername(int id, String username);

}
