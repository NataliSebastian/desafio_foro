package com.desafio_alura.foro.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="topicos")
@Entity(name= "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
//    private String fechaCreacion;
    private String status;
    private String autor;
    private String curso;
    private String respuestas;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
//        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.respuestas = datosRegistroTopico.respuestas();
    }

    public void actualizarDatos(DatosActualizadosTopico datosActualizadosTopico) {
        if (datosActualizadosTopico.titulo() !=null){
            this.titulo = datosActualizadosTopico.titulo();
        }
    }
}
