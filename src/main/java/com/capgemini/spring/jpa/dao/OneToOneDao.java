package com.capgemini.spring.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.jpa.entity.Person;

@Repository
public interface OneToOneDao extends JpaRepository<Person, Integer> {

}
