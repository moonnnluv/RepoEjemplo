package com.ale.springboot.appweb.springboot_web.controlador;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.ArrayList;
import com.ale.springboot.appweb.springboot_web.models.Usuario;



@Controller
public class UserControlador {

    @GetMapping("/details")
    public String details(Model model){
        
        Usuario usuario = new Usuario ();
        usuario.setNombre("ale");
        usuario.setApellido("reyes");
        usuario.setCorreo("ale.reyesd@duocuc.cl");

        model.addAttribute("mensaje", "Bienvenid@ a Springboot");
        model.addAttribute("user", usuario);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario("ale", "reyes", "ale.reyesd@duocuc.cl");
        Usuario usuario2 = new Usuario("alonso", "reyes", "alonso.reyes@gmail.com");
        Usuario usuario3 = new Usuario("brian", "jaramillo", "brian.jaramillo@gmail.com");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        model.addAttribute("usuarios", usuarios);
        model.addAttribute("title", "listado de usuarios");
        return "list";
    }
    
}
