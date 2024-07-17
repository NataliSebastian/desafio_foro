package com.desafio_alura.foro.respuesta;

import java.time.format.DateTimeFormatter;

public record DatosRespuesta(
        String mensaje,
        String topico,
        DateTimeFormatter fechaCreacion,
        String autor,
        String solucion) {
}
