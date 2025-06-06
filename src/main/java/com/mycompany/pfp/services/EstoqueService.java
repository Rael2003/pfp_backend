package com.mycompany.pfp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.pfp.models.Estoque;
import com.mycompany.pfp.repositories.EstoqueRepository;

@Service
public class EstoqueService {
    @Autowired
    EstoqueRepository estoqueRepository;

    public List<Estoque> ListAll() {
        return estoqueRepository.findAll();
    }

    public void AddEst(Estoque est){
        estoqueRepository.save(est);
    }

    public Estoque ListOne(long idEst){
        return estoqueRepository.getReferenceById(idEst);
    }

    public void DeleteEst(long idEst){
        Estoque est = ListOne(idEst);
        if(est.getId() != null){
            estoqueRepository.delete(est);
        }
        
    }

    public void UpdateEst(long idEst,Estoque nEst){
        Estoque aEst = ListOne(idEst);
        aEst.setCategoria(nEst.getCategoria());
        aEst.setDataEntrada(nEst.getDataEntrada());
        aEst.setDescricao(nEst.getDescricao());
        aEst.setFornecedor(nEst.getFornecedor());
        aEst.setNomeProduto(nEst.getNomeProduto());
        aEst.setPrecoCusto(nEst.getPrecoCusto());
        aEst.setQuantidade(nEst.getQuantidade());
        aEst.setUnidadeMedida(nEst.getUnidadeMedida());
        aEst.setValidade(nEst.getValidade());

        estoqueRepository.save(aEst);
    }
}
