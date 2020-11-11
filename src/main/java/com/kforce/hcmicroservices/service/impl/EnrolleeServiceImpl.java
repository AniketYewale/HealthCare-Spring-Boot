package com.kforce.hcmicroservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kforce.hcmicroservices.model.Enrollee;
import com.kforce.hcmicroservices.repository.EnrolleeRepository;
import com.kforce.hcmicroservices.service.EnrolleeService;

@Service("enrolleeService")
public class EnrolleeServiceImpl implements EnrolleeService
{
	@Autowired
	private EnrolleeRepository enrolleeRepository;
	
	@Override
	public Enrollee enrolleeGetServ(String id) {
		// TODO Auto-generated method stub
		return enrolleeRepository.enrolleeGetRepo(id);
	}

	@Override
	public Enrollee enrolleeAddServ(Enrollee enrollee) {
		// TODO Auto-generated method stub
		return enrolleeRepository.enrolleeAddRepo(enrollee);
	}

	@Override
	public Enrollee enrolleeUpdateServ(String id, Enrollee enrollee) {
		// TODO Auto-generated method stub
		return enrolleeRepository.enrolleeUpdateRepo(id, enrollee);
	}

	@Override
	public String enrolleeDeleteServ(String id) {
		// TODO Auto-generated method stub
		return enrolleeRepository.enrolleeDeleteRepo(id);
	}

}
