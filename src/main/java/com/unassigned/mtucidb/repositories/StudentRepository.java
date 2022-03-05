package com.unassigned.mtucidb.repositories;

import com.unassigned.mtucidb.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}