package com.personservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.personservice.model.Person;

public interface PersonDao extends CrudRepository<Person, String> {

	
}
