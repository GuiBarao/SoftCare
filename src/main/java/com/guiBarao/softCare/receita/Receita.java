package com.guiBarao.softCare.receita;

import jakarta.persistence.*;

@Table(name = "receitas")
@Entity(name = "Receita")
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idPaciente;
    private Long idMedico;

    private boolean ativo;

    public Receita() {}


    public Receita(DadosCadastroReceitas dados)
    {
        this.idPaciente = dados.idPaciente();
        this.idMedico = dados.idMedico();
        this.ativo = true;
    }

    public void excluir()
    {
        ativo = false;
    }

    public Long getId() {
        return id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
