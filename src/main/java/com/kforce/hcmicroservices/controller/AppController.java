package com.kforce.hcmicroservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kforce.hcmicroservices.model.Enrollee;
import com.kforce.hcmicroservices.service.EnrolleeService;

@RestController
@RequestMapping("/healthcare")
public class AppController 
{
	@Autowired
	private EnrolleeService enrolleeService;
	
	@GetMapping("/enrollee/{id}")
	public ResponseEntity<Enrollee> getEnrollee(@PathVariable String id)
	{
		return new ResponseEntity<>(enrolleeService.enrolleeGetServ(id),HttpStatus.OK);
	}
	
	@PostMapping("/enrollee")
	public ResponseEntity<Enrollee> addEnrollee(@RequestBody Enrollee enrollee)
	{
		return new ResponseEntity<>(enrolleeService.enrolleeAddServ(enrollee),HttpStatus.OK);
	}
	
	@PutMapping("/enrollee/{id}")
	public ResponseEntity<Enrollee> updateEnrollee(@PathVariable String id, @RequestBody Enrollee enrollee)
	{
		return new ResponseEntity<>(enrolleeService.enrolleeUpdateServ(id, enrollee),HttpStatus.OK);
	}
	
	@DeleteMapping("/enrollee/{id}")
	public ResponseEntity<String> deleteEnrollee(@PathVariable String id)
	{
		return new ResponseEntity<>(enrolleeService.enrolleeDeleteServ(id),HttpStatus.OK);
	}
	
	
}
