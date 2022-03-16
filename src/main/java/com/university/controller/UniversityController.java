package com.university.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.entity.University;
import com.university.repository.UniversityRepository;
import com.university.utility.UniversityValidation;

@RestController
@RequestMapping("/dataPorting/{college_id}/source")
public class UniversityController {

	@Autowired
	private UniversityRepository universityRepository;
	
	@PostMapping
	public ResponseEntity<?> createUniversity(@RequestBody University university){
		
		HashMap<String, String> response = new HashMap<String, String>();
		
		if (UniversityValidation.validate(university)) {
			university = universityRepository.save(university);
			
			if(university.getId() != null) {
				response.put("status", "Success");
			}
		} else {
			response.put("status", "Failed");
		}
		
		return ResponseEntity.ok(response);
		
	}
	
	@PutMapping
	public ResponseEntity<?> updateUniversity(@RequestBody University university){
		
		HashMap<String, String> response = new HashMap<String, String>();
		University universityDB = universityRepository.getById(university.getId());
		boolean isValid = UniversityValidation.validate(university);
		
		if (universityDB == null) {
			response.put("status", "Failed");
		} else if (isValid) {
			university = universityRepository.save(university);
			
			if(university.getId() != null) {
				response.put("status", "Success");
			}
		} else {
			response.put("status", "Failed");
		}
		
		return ResponseEntity.ok(response);
		
	}
}
