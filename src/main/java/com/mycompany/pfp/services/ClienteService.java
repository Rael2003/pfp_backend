package com.mycompany.pfp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.pfp.models.Cliente;
import com.mycompany.pfp.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> ListAll() {
        return clienteRepository.findAll();
    }

    public void AddCli(Cliente cli){
        clienteRepository.save(cli);
    }

    public Cliente ListOne(long idCli){
        return clienteRepository.getReferenceById(idCli);
    }

    public void DeleteCli(long idCli){
        Cliente cli = ListOne(idCli);
        if(cli.getId() != null){
            clienteRepository.delete(cli);
        }
        
    }

    public void UpdateCli(long idCli,Cliente nCli){
        Cliente aCli = ListOne(idCli);
        aCli.setBairro(nCli.getBairro());
        aCli.setCargoResponsavel(nCli.getCargoResponsavel());
        aCli.setCep(nCli.getCep());
        aCli.setCidade(nCli.getCidade());
        aCli.setCnpj(nCli.getCnpj());
        aCli.setComplemento(nCli.getComplemento());
        aCli.setEmail(nCli.getEmail());
        aCli.setEmailResponsavel(nCli.getEmailResponsavel());
        aCli.setEndereco(nCli.getEndereco());
        aCli.setEstado(nCli.getEstado());
        aCli.setInscricaoEstadual(nCli.getInscricaoEstadual());
        aCli.setNomeResponsavel(nCli.getNomeResponsavel());
        aCli.setNumero(nCli.getNumero());
        aCli.setTelefone(nCli.getTelefone());
        aCli.setTelefoneResponsavel(nCli.getTelefoneResponsavel());
        aCli.setNomeEmpresa(nCli.getNomeEmpresa());

        clienteRepository.save(aCli);
    }
}
