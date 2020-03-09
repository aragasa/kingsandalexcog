package com.personservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personservice.model.Person;
import com.personservice.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@GetMapping(value = "/{name}")
	public Optional<Person> getByName(@PathVariable("name") String name)
	{
		return ps.getPerson(name);
	}
	
	@PostMapping(value = "/{name}")
	public Optional<Person> postByName(@PathVariable("name") String name)
	{
		return ps.postPerson(name);
	}
	
	@PostMapping(value = "/addperson")
	public void addPerson(Person p)
	{
		ps.save(p);
	}

}
