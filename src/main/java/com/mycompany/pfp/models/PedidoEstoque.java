package com.mycompany.pfp.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos_estoque")
public class PedidoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "item_projeto_id")
    private ItemProjeto itemProjetoId;
    @ManyToOne
    @JoinColumn(name = "produto_estoque_id")
    private Estoque produtoEstoqueId;
    @Column(name = "quantidade_solicitada")
    private float quantidadeSolicitada;
    @Column(name = "quantidade_atendida")
    private float quantidadeAtendida;
    @Column(name = "data_pedido")
    private Date dataPedido;
    @Column(name = "status")
    private String status;
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public ItemProjeto getItemProjetoId() {
        return itemProjetoId;
    }
    public void setItemProjetoId(ItemProjeto itemProjetoId) {
        this.itemProjetoId = itemProjetoId;
    }
    public Estoque getProdutoEstoqueId() {
        return produtoEstoqueId;
    }
    public void setProdutoEstoqueId(Estoque produtoEstoqueId) {
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

    
}
