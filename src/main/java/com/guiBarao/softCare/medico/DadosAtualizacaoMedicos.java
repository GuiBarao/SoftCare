package com.guiBarao.softCare.medico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoMedicos(

        @NotNull
        long id,

        @Pattern(regexp = "\\d{8,19}")
        String telefone,

        @Email
        String email,

        String nome

) {}
