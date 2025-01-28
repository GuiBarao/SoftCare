package com.guiBarao.softCare.medico;

public record DadosListagemMedico(

        String nome,

        String telefone,

        String email,

        String cpf
) {

    public DadosListagemMedico(Medico dados) {
        this(dados.getNome(), dados.getTelefone(), dados.getEmail(), dados.getCpf());
    }

}
