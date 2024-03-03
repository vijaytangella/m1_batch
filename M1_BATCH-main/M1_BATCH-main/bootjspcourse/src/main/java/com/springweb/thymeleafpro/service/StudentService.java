package com.springweb.thymeleafpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.thymeleafpro.dao.StudentDao;
import com.springweb.thymeleafpro.dto.StudentDto;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;

	public String insertStudent(StudentDto studentDto) {
		return studentDao.insertStudent(studentDto);
	}

	public List<StudentDto> fetchAllStudent() {
		List<StudentDto> list = studentDao.fetchAllStudent();
		if (list.isEmpty()) {
			return null;
		} else
			return list;
	}
}
