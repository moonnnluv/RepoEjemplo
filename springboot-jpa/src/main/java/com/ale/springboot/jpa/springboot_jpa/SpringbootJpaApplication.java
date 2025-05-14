package com.ale.springboot.jpa.springboot_jpa;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.transaction.annotation.Transactional;
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

		// List<Person> persons = (List<Person>) repository.findAll();
		// List<Person> persons = (List<Person>) repository.buscarLenguaje("Java");

		// List<Person> persons = (List<Person>) repository.buscarLenguajeyNombre("Python", "Ale");
		// persons.stream().forEach(person ->{
		// 	System.out.println(person);
		// });

		
		crear();
		modificar();
		eliminar();


	}

	@Transactional
	public void crear(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese nombre: ");
		String nom = scanner.nextLine();

		System.out.print("Ingrese apellido: ");
		String ape = scanner.nextLine();

		System.out.print("Ingrese lenguaje de programación: ");
		String leng = scanner.nextLine();

		scanner.close();

	
		Person person = new Person(null,nom, ape, leng);
		Person personNew = repository.save(person);
		System.out.println(personNew);
		buscarUno(personNew.getId());
	}


	@Transactional (readOnly = true)
	public void buscarUno(Long identificador){
		Person person = null;
		Optional<Person> optionalPerson = repository.findById(identificador);
		if (optionalPerson.isPresent()) {
			person = optionalPerson.get();
		}
		System.out.println(person);
	}

	@Transactional
	public void modificar(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese id de la Persona: ");
		Long id = scanner.nextLong();

		Optional<Person> optionalPerson = repository.findById(id);
		if (optionalPerson.isPresent()) {
			Person person = optionalPerson.orElseThrow();

			System.out.println(person);

			System.out.print("Ingrese lenguaje de programación: ");
			String lenguaje = scanner.next();
			person.setLenguajes(lenguaje);

			Person personDb = repository.save(person);
			System.out.println("El objeto ha sido modificado!");
			System.out.println(personDb);
		} else {
			System.out.println("El id ingresado no existe:( )");
		} scanner.close();

	}

	@Transactional
	public void eliminar(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese id de la Persona: ");
		Long id = scanner.nextLong();

		Optional<Person> optionalPerson = repository.findById(id);
		if (optionalPerson.isPresent()) {
			Person person = optionalPerson.orElseThrow();

			System.out.println(person);

			repository.deleteById(id);
			System.out.println("El objeto ha sido elminado...");

			repository.findAll().forEach(System.out::println);
			
		} else {
			System.out.println("El id ingresado no existe:( )");
		} scanner.close();


	}


	

}
