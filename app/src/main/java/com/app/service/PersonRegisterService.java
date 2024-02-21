package com.app.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.app.model.Person;
import com.app.util.*;
import com.app.repository.PersonRepository;

public class PersonRegisterService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PersonRepository personRepository;
	
	@Transactional
	public void save(Person person) { personRepository.save(person);}
	
	@Transactional
	public void delete(Person empresa) { personRepository.delete(empresa);}
	
	@Transactional
	public void update(Person empresa) { personRepository.update(empresa);}
	
	@Transactional
	public void findAllAddress(Person empresa) { 
		personRepository.update(empresa);
	}

}
