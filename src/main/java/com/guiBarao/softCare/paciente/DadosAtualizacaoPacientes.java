package com.guiBarao.softCare.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoPacientes(

        @NotNull
        long id,

        String nome,

        @Email
        String email,

        @Pattern(regexp = "\\d{8,19}")
        String telefone
) {}
