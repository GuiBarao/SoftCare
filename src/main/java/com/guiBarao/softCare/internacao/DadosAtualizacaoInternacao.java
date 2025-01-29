package com.guiBarao.softCare.internacao;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoInternacao(

        @NotNull
        long id,

        String prontuario,

        LocalDate dataAlta

) {}
