/**
 * 
 */
package com.ofs.sms.teachers.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ofs.sms.teachers.dao.TeacherDAO;
import com.ofs.sms.teachers.db.TeachersTable;
import com.ofs.sms.teachers.model.Teacher;

/**
 * @author USER
 *
 */
@Repository
public class TeacherDAOImpl implements TeacherDAO {
	
	@Autowired
	private TeachersTable teachersTable;

	@Override
	public List<Teacher> listAllTeachers() {
		return teachersTable.getTeachersList();
	}

	@Override
	public Teacher getTeacherById(Long teacherId) {
		Teacher teacher = teachersTable.findTeacherById(teacherId);
		return teacher;		
	}

	@Override
	public Teacher createTeacher(Teacher teacher) {
		return teachersTable.insert(teacher);
	}

	@Override
	public Teacher modifyTeacher(Teacher teacher) {
		return teachersTable.update(teacher);
	}

	@Override
	public Teacher removeTeacher(Long teacherId) {
		return teachersTable.delete(teacherId);
	}

}
