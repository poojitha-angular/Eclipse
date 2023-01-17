package com.prowess.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowess.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
