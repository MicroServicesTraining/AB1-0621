/**
 * 
 */
package com.ofs.sms.teachers.service;

import java.util.List;

import com.ofs.sms.teachers.model.Teacher;

/**
 * @author USER
 *
 */

public interface TeacherService {
	
	List<Teacher> listAllTeachers();
	Teacher getTeacherById(Long teacherId);
	Teacher createTeacher(Teacher teacher);
	Teacher modifyTeacher(Teacher teacher);
	Teacher removeTeacher(Long teacherId);
	
}
