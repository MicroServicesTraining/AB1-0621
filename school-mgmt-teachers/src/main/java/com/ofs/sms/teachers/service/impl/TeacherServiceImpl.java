/**
 * 
 */
package com.ofs.sms.teachers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.sms.teachers.dao.TeacherDAO;
import com.ofs.sms.teachers.model.Teacher;
import com.ofs.sms.teachers.service.TeacherService;

/**
 * @author USER
 *
 */

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDAO teacherDAO;

	@Override
	public List<Teacher> listAllTeachers() {
		return teacherDAO.listAllTeachers();
	}

	@Override
	public Teacher getTeacherById(Long teacherId) {
		if(teacherId < 1001 && teacherId > 9999) {
			Teacher teacher = new Teacher();
			teacher.setTeacherId(teacherId);
			teacher.setName("Invalide TeacherId");
			return teacher;
		}
		return teacherDAO.getTeacherById(teacherId);
	}

	@Override
	public Teacher createTeacher(Teacher teacher) {
		// business loging and validations logic goes here
		return teacherDAO.createTeacher(teacher);
	}

	@Override
	public Teacher modifyTeacher(Teacher teacher) {
		return teacherDAO.modifyTeacher(teacher);
	}

	@Override
	public Teacher removeTeacher(Long teacherId) {
		return teacherDAO.removeTeacher(teacherId);
	}

}
