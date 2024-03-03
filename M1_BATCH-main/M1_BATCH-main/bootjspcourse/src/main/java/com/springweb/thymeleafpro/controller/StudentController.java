package com.springweb.thymeleafpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springweb.thymeleafpro.dto.CourseDto;
import com.springweb.thymeleafpro.dto.StudentDto;
import com.springweb.thymeleafpro.service.CourseService;
import com.springweb.thymeleafpro.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	CourseService courseService;

	@Autowired
	StudentService studentService;

	@GetMapping("/s")
	public String sHtml() {
		return "student";
	}

	@PostMapping("/sinsert")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto studentDto) {
		System.out.println(studentDto);
		String cname = studentDto.getCname();
		CourseDto courseDto = courseService.fetchCourseByPk(cname);
		studentDto.setCourseDto(courseDto);
		System.out.println(studentDto);
		return studentService.insertStudent(studentDto);
	}
	
	@GetMapping("/fasd")
	public String fetchAllStudent(ModelMap map){
		List<StudentDto> list=studentService.fetchAllStudent();
		map.put("objects", list);
		return "fetchall.html";
	}
}
