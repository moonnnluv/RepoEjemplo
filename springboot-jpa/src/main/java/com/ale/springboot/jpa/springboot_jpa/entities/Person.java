package com.ale.springboot.jpa.springboot_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String apellido;

    @Column(name = "lenguajes")
    private String lenguajes;

    public Person(Long id, String nombre, String apellido, String lenguajes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lenguajes = lenguajes;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Person [id =" + id + ",nombre = " + nombre + ", apellido = " + apellido + ", lenguaje = " + lenguajes + "]";
    }

    

}
