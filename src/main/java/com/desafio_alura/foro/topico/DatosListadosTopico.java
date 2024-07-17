package com.desafio_alura.foro.topico;

public record DatosListadosTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor) {

    public DatosListadosTopico (Topico topico){
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getAutor());
    }


}
