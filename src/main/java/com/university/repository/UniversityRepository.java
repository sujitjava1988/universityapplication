package com.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entity.University;

public interface UniversityRepository extends JpaRepository<University, Long>{

}
