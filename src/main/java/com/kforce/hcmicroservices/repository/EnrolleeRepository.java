package com.kforce.hcmicroservices.repository;

import com.kforce.hcmicroservices.model.Enrollee;

public interface EnrolleeRepository //extends JpaRepository<Enrollee, String>
{
	public Enrollee enrolleeGetRepo(String id);
	public Enrollee enrolleeAddRepo(Enrollee enrollee);
	public Enrollee enrolleeUpdateRepo(String id, Enrollee enrollee);
	public String enrolleeDeleteRepo(String id);
}

