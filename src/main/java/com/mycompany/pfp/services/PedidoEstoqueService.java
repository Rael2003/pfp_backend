package com.mycompany.pfp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.pfp.models.PedidoEstoque;
import com.mycompany.pfp.models.PedidoEstoqueDTO;
import com.mycompany.pfp.repositories.PedidoEstoqueRepository;

@Service
public class PedidoEstoqueService {
    @Autowired
    PedidoEstoqueRepository pedidoEstoqueRepository;

    @Autowired
    EstoqueService estoqueService;

    @Autowired
    ItemProjetoService itemProjetoService;

    public List<PedidoEstoque> ListAll() {
        return pedidoEstoqueRepository.findAll();
    }

    public void AddItem(PedidoEstoque item){
        pedidoEstoqueRepository.save(item);
    }

    public PedidoEstoque ListOne(long idItem){
        return pedidoEstoqueRepository.getReferenceById(idItem);
    }

    public List<PedidoEstoque> ListProj(long idItem){
        return pedidoEstoqueRepository.findByProjetoId(idItem);
    }
    public void DeleteItem(long idItem){
        PedidoEstoque item = ListOne(idItem);
        if(item.getId() != null){
            pedidoEstoqueRepository.delete(item);
        }
        
    }
    
    public void UpdateItem(long idItem, PedidoEstoqueDTO nItem){
        PedidoEstoque aItem = ListOne(idItem);
        aItem.setDataPedido(nItem.getDataPedido());
        aItem.setItemProjetoId(itemProjetoService.ListOne(nItem.getItemProjetoId()));
        aItem.setQuantidadeAtendida(nItem.getQuantidadeAtendida());
        aItem.setProdutoEstoqueId(estoqueService.ListOne(nItem.getProdutoEstoqueId()));
        aItem.setQuantidadeSolicitada(nItem.getQuantidadeSolicitada());
        aItem.setStatus(nItem.getStatus());

        pedidoEstoqueRepository.save(aItem);
    }

}
