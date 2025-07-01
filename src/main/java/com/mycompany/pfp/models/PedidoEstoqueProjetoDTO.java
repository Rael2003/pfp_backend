package com.mycompany.pfp.models;

import java.sql.Date;

public class PedidoEstoqueProjetoDTO {
    private Long id;
    private Long itemProjetoId;
    private String itemProjeto;
    private Long produtoEstoqueId;
    private float quantidadeSolicitada;
    private float quantidadeAtendida;
    private Date dataPedido;
    private String status;
    
    public Long getId() {
        return id;
    }
    
    public String getItemProjeto() {
        return itemProjeto;
    }

    public void setItemProjeto(String itemProjeto) {
        this.itemProjeto = itemProjeto;
    }

    public Long getItemProjetoId() {
        return itemProjetoId;
    }
    public void setItemProjetoId(Long itemProjetoId) {
        this.itemProjetoId = itemProjetoId;
    }
    public Long getProdutoEstoqueId() {
        return produtoEstoqueId;
    }
    public void setProdutoEstoqueId(Long produtoEstoqueId) {
        this.produtoEstoqueId = produtoEstoqueId;
    }
    public float getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }
    public void setQuantidadeSolicitada(float quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }
    public float getQuantidadeAtendida() {
        return quantidadeAtendida;
    }
    public void setQuantidadeAtendida(float quantidadeAtendida) {
        this.quantidadeAtendida = quantidadeAtendida;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
