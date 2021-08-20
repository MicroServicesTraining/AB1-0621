/**
 * 
 */
package com.ofs.cache.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofs.cache.demo.entity.Reader;

/**
 * @author USER
 *
 */
@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long>{

	List<Reader> findByName(String name);

}
