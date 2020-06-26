package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.dto.PersonDto;
import com.example.app.simpleCrud.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

     Person findPersonById(int id);

     List<Person> findAll ();

     void savePerson (PersonDto person);

     void deletePerson (int id);

}
