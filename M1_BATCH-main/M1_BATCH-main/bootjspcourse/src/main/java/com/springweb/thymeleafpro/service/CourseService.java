package com.springweb.thymeleafpro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.thymeleafpro.dao.CourseDao;
import com.springweb.thymeleafpro.dto.CourseDto;

@Service
public class CourseService {

	@Autowired
	CourseDao courseDao;
	
	public String insertCourse(CourseDto courseDto) {
		return courseDao.insertCourse(courseDto);
	}
	
	public CourseDto fetchCourseByPk(String cname) {
		Optional<CourseDto> cd = courseDao.fetchCourseByPk(cname);
		if(cd.isEmpty()) {
			return null;
		}
		else
			return cd.get();
	}
}
