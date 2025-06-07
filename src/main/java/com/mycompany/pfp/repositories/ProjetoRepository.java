package com.mycompany.pfp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.pfp.models.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
}
