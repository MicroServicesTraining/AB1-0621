/**
 * 
 */
package com.ofs.sms.teachers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.sms.teachers.model.Teacher;

/**
 * @author USER
 *
 */

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
	
	private List<Teacher> teachersList;

	/**
	 * @param teachersList
	 */
	public TeacherController() {
		initializeTeachersList();
	}

	//@RequestMapping(path = "/welcome", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "<h1>Welcome To School Management System</h1>";
	}
	
	@GetMapping("/all")
	public List<Teacher> listAllTeachers(){
		//initializeTeachersList();
		return teachersList;
	}
	
	@GetMapping("/byid")
	public Teacher getTeacherById(@RequestParam Long teacherId) {
		//initializeTeachersList();
		Teacher teacher = findTeacherById(teachersList, teacherId);
		return teacher;
	}

	private Teacher findTeacherById(List<Teacher> teachersList, Long teacherId) {
		for(Teacher teacher : teachersList) {
			if(teacher.getTeacherId().equals(teacherId)) {
				return teacher;
			}
		}
		return null;
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

}
