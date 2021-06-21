/**
 * 
 */
package com.ts.sb.jpa.mysql.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.sb.jpa.mysql.demo.dao.UserManagementReopository;
import com.ts.sb.jpa.mysql.demo.model.User;

/**
 * @author dorak
 *
 */
@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserManagementReopository userManagementReopository;

	public List<User> findAllUsers() {
		return userManagementReopository.findAll();
	}

	@Override
	public User findUserById(Long id) throws Exception {
		Optional<User> result =  userManagementReopository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new Exception("No user found with given id");
		}
	}

	@Override
	public User addNeUser(User user) {
		return userManagementReopository.save(user);
	}

	@Override
	public User updateUser(User user) throws Exception {
		Optional<User> result =  userManagementReopository.findById(user.getUserId());
		if(result.isPresent()) {
			User dbUserObj = result.get();
			if(user.getUserName() != null) {
				dbUserObj.setFirstName(user.getUserName());
			}
			if(user.getFirstName() != null) {
				dbUserObj.setFirstName(user.getFirstName());
			}
			if(user.getLastName() != null) {
				dbUserObj.setLastName(user.getLastName());
			}
			if(user.getPassword() != null) {
				dbUserObj.setPassword(user.getPassword());
			}
			return userManagementReopository.save(dbUserObj);
		}else {
			throw new Exception("No user found with given id");
		}
	}

	@Override
	public String deleteUser(Long id) {
		userManagementReopository.deleteById(id);
		return "User is deleted successfully";
	}

	@Override
	public User findUserByUserName(String userName) throws Exception {
		Optional<User> result =  userManagementReopository.findByUserName(userName);
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new Exception("No user found with given username");
		}
	}

	@Override
	public List<User> loadUsersNameStartsWith(String name) {
		return userManagementReopository.loadUsersNameStartsWith(name);
	}

	@Override
	public List<User> loadUsersNameContains(String fname, String lname) {
		return userManagementReopository.loadUsersNameContains(fname, lname);
	}


}
