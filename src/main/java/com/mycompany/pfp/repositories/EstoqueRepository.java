package com.mycompany.pfp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.pfp.models.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
