/**
 * 
 */
package com.ofs.sms.teachers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.sms.teachers.model.Teacher;
import com.ofs.sms.teachers.service.TeacherService;

/**
 * @author USER
 *
 */

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	//@RequestMapping(path = "/welcome", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "<h1>Welcome To School Management System</h1>";
	}
	
	@GetMapping
	public List<Teacher> listAllTeachers(){
		return teacherService.listAllTeachers();
	}
	
	@PostMapping
	public Teacher createTeacher(@RequestBody Teacher teacher) {
		return teacherService.createTeacher(teacher);
	}
	
	@PutMapping
	public Teacher modifyTeacher(@RequestBody Teacher teacher) {
		return teacherService.modifyTeacher(teacher);
	}
	
	@DeleteMapping
	public Teacher removeTeacher(@RequestParam Long teacherId) {
		return teacherService.removeTeacher(teacherId);
	}
	
	@GetMapping("/byid")
	public Teacher getTeacherById(@RequestParam Long teacherId) {
		Teacher teacher = teacherService.getTeacherById(teacherId);
		return teacher;
	}

}
