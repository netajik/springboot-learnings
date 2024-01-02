package com.api.springbootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.springbootmongodb.collection.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstNameStartsWith(String name);

    @Query(value = "{'age':{ $gt: ?0,$lt:?1}}")
    List<Person> findPersonByAgeBetween(Integer min, Integer max);

}
