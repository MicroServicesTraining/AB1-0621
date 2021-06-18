/**
 * 
 */
package com.ofs.jpa.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofs.jpa.model.User;

/**
 * @author USER
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
