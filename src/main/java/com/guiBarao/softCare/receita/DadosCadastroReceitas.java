package com.guiBarao.softCare.receita;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroReceitas(

        Long idPaciente,

        @NotNull
        Long idMedico

) {}
