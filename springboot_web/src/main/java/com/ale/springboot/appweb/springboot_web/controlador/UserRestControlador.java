package com.ale.springboot.appweb.springboot_web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale.springboot.appweb.springboot_web.dto.UserDto;
import com.ale.springboot.appweb.springboot_web.models.Usuario;

import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class UserRestControlador 
{
    @GetMapping("/details-map")
    public UserDto details(){
        UserDto userDto = new UserDto();
        Usuario usuario = new Usuario("ale", "reyes", "ale.reyesd@duocuc.cl");

       
       userDto.setUser(usuario);
       userDto.setTitulo("holaaaa :D");
       return userDto;
    }
    
}
