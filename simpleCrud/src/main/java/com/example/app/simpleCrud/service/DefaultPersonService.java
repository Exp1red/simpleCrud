package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.dto.PersonDto;
import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.repository.PersonRepository;


import java.util.List;

public class DefaultPersonService implements PersonService {

    private final PersonRepository personRepository;

    public DefaultPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person findPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public void savePerson(PersonDto personDto) {

    }

    @Override
    public void deletePerson(int id) {

    }
}
