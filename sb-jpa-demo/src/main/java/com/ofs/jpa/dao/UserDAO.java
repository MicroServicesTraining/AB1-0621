/**
 * 
 */
package com.ofs.jpa.dao;

import java.util.List;

import com.ofs.jpa.model.User;

/**
 * @author USER
 *
 */
public interface UserDAO {

	List<User> listUsers();

	User createUser(User user);

	User modifyUser(User user);

}
