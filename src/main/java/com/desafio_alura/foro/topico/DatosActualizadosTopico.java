package com.desafio_alura.foro.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizadosTopico(
        @NotNull
        Long id,
        String titulo) {
}
