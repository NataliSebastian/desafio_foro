package com.desafio_alura.foro.controller;

import com.desafio_alura.foro.respuesta.DatosRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @PostMapping
    public void registarUsuario(@RequestBody DatosRespuesta datosRespuesta){
        System.out.println("El request llego correcatmente");
        System.out.println(datosRespuesta);
    }
}
