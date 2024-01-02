package com.api.springbootmongodb.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.api.springbootmongodb.collection.Person;
import com.api.springbootmongodb.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

     @Override
    public List<Person> getPersonStartWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return personRepository.findPersonByAgeBetween(minAge,maxAge);
    }

    @Override
    public Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable) {
        return null;
    }

    @Override
    public List<Document> getOldestPersonByCity() {
        return null;
    }

    @Override
    public List<Document> getPopulationByCity() {
        return  null;
    }

}
