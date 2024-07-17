package com.desafio_alura.foro.controller;

import com.desafio_alura.foro.curso.DatosCurso;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {@PostMapping
public void registarUsuario(@RequestBody DatosCurso datosCurso){
    System.out.println("El request llego correcatmente");
    System.out.println(datosCurso);
}
}
