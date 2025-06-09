package com.mycompany.pfp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.pfp.models.PedidoEstoque;

@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque,Long>{
}
