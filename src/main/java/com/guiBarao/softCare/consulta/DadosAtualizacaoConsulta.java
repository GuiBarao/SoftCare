package com.guiBarao.softCare.consulta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public record DadosAtualizacaoConsulta(

        @NotNull
        long id,

        LocalDate data,

        LocalTime horario,

        String prontuario,

        StatusConsulta status

) {
}
