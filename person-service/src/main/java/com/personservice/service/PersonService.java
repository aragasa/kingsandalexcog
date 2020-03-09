package com.personservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personservice.dao.PersonDao;
import com.personservice.model.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao pd;
	
	private static Person person = new Person(25, "Kent");
	
	public Optional<Person> getPerson(String name)
	{
		return pd.findById(name);
	}
	
	public Person save(Person p)
	{
		pd.save(person);
		return person;
	}

	public Optional<Person> postPerson(String name) {
		pd.post(person);
		
		return null;
	}
	
	
}
