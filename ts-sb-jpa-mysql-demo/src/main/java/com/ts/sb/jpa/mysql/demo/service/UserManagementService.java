/**
 * 
 */
package com.ts.sb.jpa.mysql.demo.service;

import java.util.List;

import com.ts.sb.jpa.mysql.demo.model.User;

/**
 * @author dorak
 *
 */
public interface UserManagementService {

	List<User> findAllUsers();
	User findUserById(Long id) throws Exception;
	User addNeUser(User user);
	User updateUser(User user) throws Exception;
	String deleteUser(Long id);
	User findUserByUserName(String userName) throws Exception;
	List<User> loadUsersNameStartsWith(String name);
	List<User> loadUsersNameContains(String fname, String lname);

}
