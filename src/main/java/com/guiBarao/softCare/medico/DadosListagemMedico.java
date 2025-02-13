package com.guiBarao.softCare.medico;

public record DadosListagemMedico(

        Long id,

        String nome,

        String telefone,

        String email,

        String cpf,

        Double precoConsulta
) {

    public DadosListagemMedico(Medico dados) {
        this(dados.getId(), dados.getNome(), dados.getTelefone(),
                dados.getEmail(), dados.getCpf(), dados.getPrecoConsulta());
    }

}
