package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication extends Manager implements CommandLineRunner{


    @Autowired
    PersonRepository personRepository;
    @Autowired
    ManagerRepository managerRepository;
    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }



    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("John");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("John");
        System.out.println(personFromDb);

        Manager m = new Manager();
        m.setFirstName("Steven");
        m.setLastName("Chea");
        managerRepository.save(m);



    }
 
    public void toString(Manager m){

        System.out.println("Manager name: " + managerRepository.findByFirstName(m.getFirstName()) + " "
                + managerRepository.findByLastName(m.getLastName()));

        toString(m);
    }
}
