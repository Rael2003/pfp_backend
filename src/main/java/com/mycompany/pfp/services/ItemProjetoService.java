package com.mycompany.pfp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.pfp.models.ItemProjeto;
import com.mycompany.pfp.models.ItemProjetoDTO;
import com.mycompany.pfp.repositories.ItemProjetoRepository;

@Service
public class ItemProjetoService {
    @Autowired
    private ItemProjetoRepository itemProjetoRepository; 

    @Autowired
    private ProjetoService projetoRepository;

    public List<ItemProjeto> ListAll() {
        return itemProjetoRepository.findAll();
    }

    public void AddItem(ItemProjeto item){
        itemProjetoRepository.save(item);
    }

    public ItemProjeto ListOne(long idItem){
        return itemProjetoRepository.getReferenceById(idItem);
    }
    public void DeleteItem(long idItem){
        ItemProjeto item = ListOne(idItem);
        if(item.getId() != null){
            itemProjetoRepository.delete(item);
        }
        
    }
    
    public void UpdateItem(long idItem, ItemProjetoDTO nItem){
        ItemProjeto aItem = ListOne(idItem);
        aItem.setData_conclusao(nItem.getData_conclusao());
        aItem.setData_entrega_prevista(nItem.getData_entrega_prevista());
        aItem.setData_inicio(nItem.getData_inicio());
        aItem.setDescricao(nItem.getDescricao());
        aItem.setProjeto(projetoRepository.ListOne(nItem.getProjeto()));
        aItem.setStatus(nItem.getStatus());
        aItem.setTitulo_item(nItem.getTitulo_item());

        itemProjetoRepository.save(aItem);
    }
}
