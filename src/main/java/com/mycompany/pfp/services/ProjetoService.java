package com.mycompany.pfp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.pfp.models.Projeto;
import com.mycompany.pfp.models.ProjetoDTO;
import com.mycompany.pfp.repositories.ProjetoRepository;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    FuncionarioService funcionarioService = new FuncionarioService();
    
    @Autowired
    ClienteService clienteService = new ClienteService();

    public List<Projeto> ListAll() {
        return projetoRepository.findAll();
    }

    public void AddProj(Projeto proj){
        projetoRepository.save(proj);
    }

    public Projeto ListOne(long idProj){
        return projetoRepository.getReferenceById(idProj);
    }
    public void DeleteProj(long idProj){
        Projeto proj = ListOne(idProj);
        if(proj.getId() != null){
            projetoRepository.delete(proj);
        }
        
    }
    
    public void UpdateProj(long idProj, ProjetoDTO nProj){
        Projeto aProj = ListOne(idProj);
        aProj.setDataInicio(nProj.getDataInicio());
        aProj.setDataPrevisaoEntrega(nProj.getDataPrevisaoEntrega());
        aProj.setDescricao(nProj.getDescricao());
        aProj.setEmpresaClienteId(clienteService.ListOne(nProj.getEmpresaClienteId()));
        aProj.setFuncionarioResponsavelId(funcionarioService.ListOne(nProj.getFuncionarioResponsavelId()));
        aProj.setNomeProjeto(nProj.getNomeProjeto());
        aProj.setPrioridade(nProj.getPrioridade());
        aProj.setStatus(nProj.getStatus());

        projetoRepository.save(aProj);
    }
    
}
