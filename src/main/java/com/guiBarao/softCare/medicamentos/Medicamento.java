package com.guiBarao.softCare.medicamentos;
import jakarta.persistence.*;

@Table(name = "medicamentos")
@Entity(name = "Medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private float preco;
    private String descricao;
    private long quantEstoque;
    private boolean ativo;

    public Medicamento() {}

    public Medicamento(DadosCadastroMedicamento dados)
    {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.quantEstoque = 0;
        this.ativo = true;
    }

    public void atualizarInfo(DadosAtualizacaoMedicamento dados)
    {
        if(dados.preco() != null)
        {
            this.preco = dados.preco();
        }

        if(dados.descricao() != null)
        {
            this.descricao = dados.descricao();
        }

        if(dados.quantEstoque() != null)
        {
            this.quantEstoque = dados.quantEstoque();
        }
    }

    public void excluir()
    {
        this.ativo = false;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getQuantEstoque() {
        return quantEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
