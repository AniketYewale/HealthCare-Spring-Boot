package com.kforce.hcmicroservices.service;

import com.kforce.hcmicroservices.model.Enrollee;


public interface EnrolleeService
{
	public Enrollee enrolleeGetServ(String id);
	public Enrollee enrolleeAddServ(Enrollee enrollee);
	public Enrollee enrolleeUpdateServ(String id, Enrollee enrollee);
	public String enrolleeDeleteServ(String id);
	
}
