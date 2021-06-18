/**
 * 
 */
package com.ofs.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.jpa.dao.UserDAO;
import com.ofs.jpa.model.User;
import com.ofs.jpa.service.UserService;

/**
 * @author USER
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDAO userDao;

	@Override
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	@Override
	public User createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public User modifyUser(User user) {
		return userDao.modifyUser(user);
	}

}
