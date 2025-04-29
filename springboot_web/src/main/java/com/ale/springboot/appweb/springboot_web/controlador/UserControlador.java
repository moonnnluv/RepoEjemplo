package com.ale.springboot.appweb.springboot_web.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserControlador {
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("mensaje", "holi");
        model.addAttribute("usuario", "ale");
        
        return "details";
    }
}
