/**
 * 
 */
package com.ofs.jpa.service;

import java.util.List;

import com.ofs.jpa.model.User;

/**
 * @author USER
 *
 */

public interface UserService {

	List<User> listUsers();

	User createUser(User user);

	User modifyUser(User user);

}
