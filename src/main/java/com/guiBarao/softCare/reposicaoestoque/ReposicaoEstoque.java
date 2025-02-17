package com.guiBarao.softCare.reposicaoestoque;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "reposicoes")
@Entity(name = "reposicao")
public class ReposicaoEstoque {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idMedicamento;

    @Enumerated(EnumType.STRING)
    private StatusReposicao status;

    private LocalDate dataPedido;

    public ReposicaoEstoque() {}

    public ReposicaoEstoque (DadosCadastroReposicaoEstoque dados)
    {
        this.idMedicamento = dados.idMedicamento();
        this.status = StatusReposicao.PENDENTE;
        this.dataPedido = LocalDate.now();
    }

    public void setStatus(StatusReposicao status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public StatusReposicao getStatus() {
        return status;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }
}
