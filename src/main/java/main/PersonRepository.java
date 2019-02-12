package main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findFirstByName(String name);

        Person findByIdGreaterThan(int id);

}
