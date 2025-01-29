package com.guiBarao.softCare.internacao;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroInternacao(

        @NotNull
        long idPaciente,

        @NotNull
        LocalDate dataInicio

) {}
