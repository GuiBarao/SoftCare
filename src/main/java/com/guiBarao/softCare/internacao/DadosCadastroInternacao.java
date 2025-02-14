package com.guiBarao.softCare.internacao;

import jakarta.validation.constraints.NotNull;


public record DadosCadastroInternacao(

        @NotNull
        long idPaciente

) {}
