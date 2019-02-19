package main;

import org.springframework.data.repository.CrudRepository;


public interface ManagerRepository  extends CrudRepository<Manager, Integer>{


    Manager findByFirstName (String first_name);
    Manager findByLastName (String last_name);

}
