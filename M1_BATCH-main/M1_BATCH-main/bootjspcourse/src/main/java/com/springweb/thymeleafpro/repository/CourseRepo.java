package com.springweb.thymeleafpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springweb.thymeleafpro.dto.CourseDto;

@Repository
public interface CourseRepo extends JpaRepository<CourseDto, String>{

}
