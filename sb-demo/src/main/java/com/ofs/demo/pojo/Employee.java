/**
 * 
 */
package com.ofs.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author USER
 *
 */

/* @Data is equivalent of 
 * @Getter
 * 
 * @Setter
 * 
 * @EqualsAndHashCode
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Long empId;	
}
