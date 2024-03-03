package com.springweb.thymeleafpro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.thymeleafpro.dto.StudentDto;
import com.springweb.thymeleafpro.repository.StudentRepo;

@Component
public class StudentDao {
	@Autowired
	StudentRepo studentRepo;

	public String insertStudent(StudentDto studentDto) {
		studentRepo.save(studentDto);
		return "data inserted";
	}

	public List<StudentDto> fetchAllStudent() {
		return studentRepo.findAll();
	}

}
