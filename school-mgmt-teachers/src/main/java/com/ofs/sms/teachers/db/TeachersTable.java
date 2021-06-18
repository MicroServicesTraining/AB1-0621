/**
 * 
 */
package com.ofs.sms.teachers.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ofs.sms.teachers.model.Teacher;

/**
 * @author USER
 *
 */
@Component
public class TeachersTable {
	
	private List<Teacher> teachersList;
	
	public TeachersTable() {
		initializeTeachersList();
	}
	
	private void initializeTeachersList() {
		teachersList = new ArrayList<Teacher>();
		Teacher t1 = new Teacher();
		t1.setTeacherId(1001L);
		t1.setName("Kiran");
		t1.setSubject("Java");
		t1.setSalary(15000.00);
		teachersList.add(t1);
		Teacher t2 = new Teacher();
		t2.setTeacherId(1002L);
		t2.setName("Krishna");
		t2.setSubject("Oracle");
		t2.setSalary(12000.00);
		teachersList.add(t2);
		Teacher t3 = new Teacher();
		t3.setTeacherId(1003L);
		t3.setName("Kalyan");
		t3.setSubject("C++");
		t3.setSalary(10000.00);
		teachersList.add(t3);
	}
	
	public Teacher findTeacherById(Long teacherId) {
		for(Teacher teacher : teachersList) {
			if(teacher.getTeacherId().equals(teacherId)) {
				return teacher;
			}
		}
		return null;
	}

	/**
	 * @return the teachersList
	 */
	public List<Teacher> getTeachersList() {
		return teachersList;
	}

	/**
	 * @param teachersList the teachersList to set
	 */
	public void setTeachersList(List<Teacher> teachersList) {
		this.teachersList = teachersList;
	}

	public Teacher insert(Teacher teacher) {
		this.teachersList.add(teacher);
		return teacher;
	}

	public Teacher update(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher delete(Long teacherId) {
		// TODO Auto-generated method stub
		return null;
	}

}
