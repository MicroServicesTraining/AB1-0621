/**
 * 
 */
package com.ofs.jpa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ofs.jpa.dao.UserDAO;
import com.ofs.jpa.dao.repository.UserRepository;
import com.ofs.jpa.model.User;

/**
 * @author USER
 *
 */
@Component
public class UserDAOImpl implements UserDAO{

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> listUsers() {
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User modifyUser(User user) {
		return userRepository.save(user);
	}

}
