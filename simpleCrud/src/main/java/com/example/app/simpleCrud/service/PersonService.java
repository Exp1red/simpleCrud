package com.example.app.simpleCrud.service;

import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.repository.AutoRepository;
import com.example.app.simpleCrud.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final AutoRepository autoRepository;
    private final PersonRepository personRepository;

    public PersonService(AutoRepository autoRepository, PersonRepository personRepository) {
        this.autoRepository = autoRepository;
        this.personRepository = personRepository;
    }

    public Person findPersonById(int id){
        return personRepository.getOne(id);
    }

    public List<Person> findAll (){
        return personRepository.findAll();
    }

    public void savePerson (Person person){
        personRepository.save(person);
    }

    public void deletePerson (int id){
        personRepository.deleteById(id);
    }

}
