package com.desafio_alura.foro.controller;

import com.desafio_alura.foro.perfil.DatosPerfil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {
    @PostMapping
    public void registarUsuario(@RequestBody DatosPerfil datosPerfil){
        System.out.println("El request llego correcatmente");
        System.out.println(datosPerfil);
    }
}
