package com.springweb.thymeleafpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springweb.thymeleafpro.dto.StudentDto;

@Repository
public interface StudentRepo extends JpaRepository<StudentDto, Integer>{

}
