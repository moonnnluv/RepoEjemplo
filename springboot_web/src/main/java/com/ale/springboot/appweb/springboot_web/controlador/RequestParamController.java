package com.ale.springboot.appweb.springboot_web.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.ale.springboot.appweb.springboot_web.dto.ParamDto;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api/params")


public class RequestParamController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam (required = false) String mensaje) {
        ParamDto param = new ParamDto();
        param.setMensaje(mensaje);
        return param;
    }
    

}
