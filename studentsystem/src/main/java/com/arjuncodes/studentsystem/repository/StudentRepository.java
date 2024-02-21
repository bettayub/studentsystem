package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Student is the modal class and type of primary key is Integer
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
}
