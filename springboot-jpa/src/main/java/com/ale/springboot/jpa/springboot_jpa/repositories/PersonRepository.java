package com.ale.springboot.jpa.springboot_jpa.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ale.springboot.jpa.springboot_jpa.entities.Person;
import java.util.List;


public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByLenguajes(String lenguajes);


    // NO APARECE EN EL PersonRepository DE LA PROFE !!!

    @Query("select p from Person p where p.lenguajes=?1 and p.nombre=?2")
    List<Person> buscarLenguajeyNombre(String lenguajes, String nombre);


    
}
