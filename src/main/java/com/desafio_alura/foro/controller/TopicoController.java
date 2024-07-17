package com.desafio_alura.foro.controller;

import com.desafio_alura.foro.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registarUsuario(@RequestBody DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }
    @GetMapping
    public Page<DatosListadosTopico> listadoTopico(@PageableDefault(size = 10) Pageable paginacion){
        return topicoRepository.findAll(paginacion)
                .map(DatosListadosTopico::new);
    }
    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizadosTopico datosActualizadosTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizadosTopico.id());
        topico.actualizarDatos(datosActualizadosTopico);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topico topico =topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }
}
