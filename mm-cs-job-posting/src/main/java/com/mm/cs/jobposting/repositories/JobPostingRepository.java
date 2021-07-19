/**
 * 
 */
package com.mm.cs.jobposting.repositories;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.cs.jobposting.entities.JobPosting;

/**
 * @author dorak
 *
 */
@NamedQueries({
	@NamedQuery(name="JobPosting.findJobPostingByName", query="select jp from JobPosting jp where jp.name = :name")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="JobPosting.getJobPostingByName", query="select * from jobposting where name = :name")
})
public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
	
	public JobPosting findByName(String name);
	
	public JobPosting findJobPostingByName(String name);
	
	public JobPosting getJobPostingByName(String name);
	
}
