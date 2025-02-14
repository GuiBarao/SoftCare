package com.guiBarao.softCare.medicamentos;

public record DadosListagemMedicamentos(

        long id,

        String nome,

        float preco,

        String descricao,

        long quantEstoque,

        Long estoqueMaximo,

        boolean ativo

) {

    public DadosListagemMedicamentos (Medicamento dados) {
        this(dados.getId(), dados.getNome(), dados.getPreco(),
                dados.getDescricao(), dados.getQuantEstoque(), dados.getEstoqueMaximo(), dados.isAtivo());
    }
}
