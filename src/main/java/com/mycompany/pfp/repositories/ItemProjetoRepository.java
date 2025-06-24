package com.mycompany.pfp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.pfp.models.ItemProjeto;

@Repository
public interface ItemProjetoRepository extends JpaRepository<ItemProjeto,Long>{
    List<ItemProjeto> findByProjetoId(Long projetoId);
}
