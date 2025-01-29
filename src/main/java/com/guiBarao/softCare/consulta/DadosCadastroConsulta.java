package com.guiBarao.softCare.consulta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public record DadosCadastroConsulta(

        @NotNull
        long idPaciente,

        @NotNull
        long idMedico,

        @NotNull
        LocalDate data,

        @NotNull
        LocalTime horario

){}
