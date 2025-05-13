package com.ale.springboot.jpa.springboot_jpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ale.springboot.jpa.springboot_jpa.entities.Person;
import com.ale.springboot.jpa.springboot_jpa.repositories.PersonRepository;



@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		List<Person> persons = (List<Person>) repository.buscarLenguajeyNombre("Python", "Ale");
		persons.stream().forEach(person ->{
			System.out.println(persons);
		});


	}

	public void crear(){
		Person person = new Person(null,"Emilia", "Munoz", "Java");
		Person personNew = repository.save(person);
		System.out.println(personNew);
	}

}
