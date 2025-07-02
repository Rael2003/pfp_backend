package com.mycompany.pfp.models;

import java.time.LocalDate;

public class ItemProjetoDTO {

    private Long id;
    private Long projeto;
    private String titulo_item;
    private String descricao;
    private String status;
    private LocalDate data_inicio;
    private LocalDate data_entrega_prevista;
    private LocalDate data_conclusao;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getProjeto() {
        return projeto;
    }
    public void setProjeto(Long projeto) {
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

    
}
