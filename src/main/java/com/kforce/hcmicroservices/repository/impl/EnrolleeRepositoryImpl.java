package com.kforce.hcmicroservices.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
		Optional<Enrollee> enrolleeObj = enrolleeRepository.findById(id);
		return enrolleeObj.get();
	}

	@Override
	public Enrollee enrolleeAddRepo(Enrollee enrollee) 
	{
		Optional<Enrollee> enrolleeObj = enrolleeRepository.findById(enrollee.getId());
        Enrollee newEnrollee= enrolleeObj.get();
        newEnrollee.setId(enrollee.getId());
       	newEnrollee.setName(enrollee.getName());
       	newEnrollee.setActStatus(enrollee.getActStatus());
       	newEnrollee.setBirthDate(enrollee.getBirthDate());
       	newEnrollee.setPhoneNo(enrollee.getPhoneNo());
       	newEnrollee.setDependent(enrollee.getDependent());
 
       	newEnrollee = enrolleeRepository.save(newEnrollee);
        return newEnrollee;
	}

	@Override
	public Enrollee enrolleeUpdateRepo(String id, Enrollee enrollee) 
	{
		Optional<Enrollee> enrolleeObj = enrolleeRepository.findById(id);
        Enrollee updateEnrollee= enrolleeObj.get();
        updateEnrollee.setId(enrollee.getId());
        updateEnrollee.setName(enrollee.getName());
        updateEnrollee.setActStatus(enrollee.getActStatus());
        updateEnrollee.setBirthDate(enrollee.getBirthDate());
        updateEnrollee.setPhoneNo(enrollee.getPhoneNo());
        updateEnrollee.setDependent(enrollee.getDependent());
 
        updateEnrollee = enrolleeRepository.save(updateEnrollee);
        return updateEnrollee;
	}

	@Override
	public String enrolleeDeleteRepo(String id) 
	{
		Optional<Enrollee> enrolleeObj = enrolleeRepository.findById(id);
		enrolleeRepository.deleteById(id);
		return "Enrollee deleted";
	}

	@Override
	public List<Enrollee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enrollee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enrollee> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enrollee> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Enrollee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Enrollee getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Enrollee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Enrollee> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Enrollee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Enrollee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enrollee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enrollee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Enrollee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
