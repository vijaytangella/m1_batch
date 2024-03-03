package com.springweb.thymeleafpro.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springweb.thymeleafpro.dto.CourseDto;
import com.springweb.thymeleafpro.repository.CourseRepo;

@Component
public class CourseDao {
	@Autowired
	CourseRepo courseRepo;

	public String insertCourse(CourseDto courseDto) {
		courseRepo.save(courseDto);
		return "course info saved";
	}

	public Optional<CourseDto> fetchCourseByPk(String cname) {
		Optional<CourseDto> cd = courseRepo.findById(cname);
		return cd;
	}
}
