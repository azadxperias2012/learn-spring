package com.neotechlabs.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neotechlabs.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository 
				extends JpaRepository<Person, Integer> {

}
