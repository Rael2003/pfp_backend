package com.mycompany.pfp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.pfp.models.Funcionario;


@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}