package com.ale.springboot.appweb.springboot_web.dto;
import com.ale.springboot.appweb.springboot_web.models.Usuario;

public class UserDto 
{

    private String titulo;
    private Usuario user;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Usuario getUser() {
        return user;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }

    public UserDto() {

    }

    
}
