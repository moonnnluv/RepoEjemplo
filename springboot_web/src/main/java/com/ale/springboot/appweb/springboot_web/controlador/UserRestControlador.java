package com.ale.springboot.appweb.springboot_web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale.springboot.appweb.springboot_web.models.Usuario;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class UserRestControlador 
{
    @GetMapping("/details")
    
    public Map<String, Object> detailsMap{
        Usuario usuario = new Usuario("ale", "reyes", "ale.reyesd@duocuc.cl");
       Map<String, Object> body=new HashMap<>();
       body.put("mensaje", "holi");
       body.put("usuario", "ale");
       return body;
    }
    
}
