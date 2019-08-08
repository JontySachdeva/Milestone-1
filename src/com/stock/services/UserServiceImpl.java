package com.stock.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.UserDao;
import com.stock.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserServices {
	
	@Autowired
	UserDao userDaoInterface;
	
	@Override
	public int addOrUpdateUser(User userData, int index) {
		return userDaoInterface.addOrUpdateUser(userData,2);
	}

	@Override
	public User getUser(String username, String password) {
		return userDaoInterface.getUser(username, password);
	}

	@Override
	public List<User> usersList() {
		return userDaoInterface.usersList();
	}

	@Override
	public User getUserByIdOrUsername(int id, String username) {
		return userDaoInterface.getUserByIdOrUsername(id, username);
	}

	@Override
	public boolean deleteUserByIdOrUsername(int id, String username) {
		return userDaoInterface.deleteUserByIdOrUsername(id, username);
	}

}
