package com.mhdarslan.LearningRestAPIs.repository;

import com.mhdarslan.LearningRestAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // extend with entity and its type of id which is long in Student

}
