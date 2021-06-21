/**
 * 
 */
package com.ts.sb.jpa.mysql.demo.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ts.sb.jpa.mysql.demo.model.User;

/**
 * @author dorak
 *
 */
@Repository
@NamedQuery(name = "loadUsersNameContains", query = "select u from User u where u.firstName like  %:fname% or u.lastName like %:lastname%" )
public interface UserManagementReopository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
	
	@Query("select u from User u where u.firstName like ?1%")
	List<User> loadUsersNameStartsWith(String name);
	
	/*
	 * @Query("select u from User u where u.firstName like  %?1% or u.lastName like %?2%"
	 * ) List<User> loadUsersNameContains(String fname, String lname);
	 */

	//@Query("select u from User u where u.firstName like  %:fname% or u.lastName like %:lastname%")
	@Query(name = "loadUsersNameContains")
	List<User> loadUsersNameContains(String fname, @Param(value = "lastname") String lname);

}
