package com.guiBarao.softCare.prescricao;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroPrescricao(

        Long idReceita,

        @NotNull
        Long idMedicamento,

        @NotNull
        String descricao
) {}
