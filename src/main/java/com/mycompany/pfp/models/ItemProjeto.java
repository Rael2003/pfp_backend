package com.mycompany.pfp.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "itens_projeto")
public class ItemProjeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "projeto_id", nullable = false)
    private Projeto projeto;

    @Column(name = "titulo_item")
    private String titulo_item;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private String status;

    @Column(name = "data_inicio")
    private LocalDate data_inicio;

    @Column(name = "data_entrega_prevista")
    private LocalDate data_entrega_prevista;

    @Column(name = "data_conclusao")
    private LocalDate data_conclusao;

    @Column(name = "quantidade")
    private Integer quantidade;

    public Long getId() {
        return id;
    }
    
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getTitulo_item() {
        return titulo_item;
    }

    public void setTitulo_item(String titulo_item) {
        this.titulo_item = titulo_item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_entrega_prevista() {
        return data_entrega_prevista;
    }

    public void setData_entrega_prevista(LocalDate data_entrega_prevista) {
        this.data_entrega_prevista = data_entrega_prevista;
    }

    public LocalDate getData_conclusao() {
        return data_conclusao;
    }

    public void setData_conclusao(LocalDate data_conclusao) {
        this.data_conclusao = data_conclusao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
}
