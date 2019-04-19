package com.capgemini.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.jpa.dao.OneToOneDao;
import com.capgemini.spring.jpa.entity.Person;
import com.capgemini.spring.jpa.entity.Profile;

@RestController
public class Controller {

	@Autowired
	private OneToOneDao dao;

	@RequestMapping("/")
	public void add() {
		Person person = new Person(100, "Donode", new Profile(200, "JAVA TOPPPER"));
		dao.save(person);

	}

	@RequestMapping("/new")
	public Person findByID() {
		Person person = dao.findById(100).get();
		return person;
	}

}
