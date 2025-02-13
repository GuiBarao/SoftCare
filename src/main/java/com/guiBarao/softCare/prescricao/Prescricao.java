package com.guiBarao.softCare.prescricao;

import jakarta.persistence.*;

import java.time.LocalDate;


@Table(name = "prescricoes")
@Entity(name = "Prescricao")
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idReceita;
    private Long idMedicamento;

    private String descricao;
    private boolean ativo;
    private LocalDate data;

    public Prescricao(){}

    public Prescricao(DadosCadastroPrescricao dados)
    {
        this.idReceita = dados.idReceita();
        this.idMedicamento = dados.idMedicamento();
        this.descricao = dados.descricao();
        this.ativo = true;
        this.data = LocalDate.now();
    }

    public void excluir()
    {
        this.ativo = false;
    }

    public Long getId() {
        return id;
    }

    public Long getIdReceita() {
        return idReceita;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDate getData() {
        return data;
    }
}
