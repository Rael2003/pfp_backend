package com.mycompany.pfp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.pfp.models.ItemProjeto;
import com.mycompany.pfp.models.PedidoEstoque;


@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque,Long>{ 
    List<PedidoEstoque> findByItemProjetoId(ItemProjeto projetoId);
}
