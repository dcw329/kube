package com.danielstools.services.person.repos;

import com.danielstools.services.person.models.Person;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    ArrayList<Person> findByFirstName(String FirstName);

    @Override
    ArrayList<Person> findAll();
}
