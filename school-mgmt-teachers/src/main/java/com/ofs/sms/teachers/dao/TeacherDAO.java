/**
 * 
 */
package com.ofs.sms.teachers.dao;

import java.util.List;

import com.ofs.sms.teachers.model.Teacher;

/**
 * @author USER
 *
 */
public interface TeacherDAO {
	
	List<Teacher> listAllTeachers();
	Teacher getTeacherById(Long teacherId);
	Teacher createTeacher(Teacher teacher);
	Teacher modifyTeacher(Teacher teacher);
	Teacher removeTeacher(Long teacherId);

}
