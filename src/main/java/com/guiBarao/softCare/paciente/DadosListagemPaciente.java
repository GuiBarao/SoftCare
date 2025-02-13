package com.guiBarao.softCare.paciente;

import java.time.LocalDate;

public record DadosListagemPaciente(Long id, String nome, LocalDate dataNascimento,
                                    String email, String cpf, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getDataNascimento(),
                paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}
