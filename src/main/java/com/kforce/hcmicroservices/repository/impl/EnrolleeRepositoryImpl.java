package com.kforce.hcmicroservices.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kforce.hcmicroservices.model.Enrollee;
import com.kforce.hcmicroservices.repository.EnrolleeRepository;

@Repository("enrolleeRepository")
public class EnrolleeRepositoryImpl implements EnrolleeRepository
{
	@Autowired
	 EnrolleeRepository enrolleeRepository;
	
	@Override
	public Enrollee enrolleeGetRepo(String id) 
	{
		// TODO Auto-generated method stub
		//Optional<Enrollee> enrolleeObj = enrolleeRepository.findById(id);
		return null;
	}

	@Override
	public Enrollee enrolleeAddRepo(Enrollee enrollee) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enrollee enrolleeUpdateRepo(String id, Enrollee enrollee) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String enrolleeDeleteRepo(String id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
