package com.guiBarao.softCare.paciente;

import java.time.LocalDate;

public record DadosListagemPaciente(String nome, LocalDate dataNascimento,
                                    String email, String cpf, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getDataNascimento(),
                paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}
