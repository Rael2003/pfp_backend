package com.mycompany.pfp.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.pfp.models.Cliente;
import com.mycompany.pfp.models.Funcionario;
import com.mycompany.pfp.models.Projeto;
import com.mycompany.pfp.models.ProjetoDTO;
import com.mycompany.pfp.services.ClienteService;
import com.mycompany.pfp.services.FuncionarioService;
import com.mycompany.pfp.services.ProjetoService;
import com.mycompany.pfp.services.Usuario;

@RestController
public class ProjetoController {
    private final ProjetoService serv;
    private final FuncionarioService servFunc;
    private final ClienteService servCli;

    public ProjetoController(ProjetoService serv,FuncionarioService servFunc,ClienteService servCli) {
        this.serv = serv;
        this.servFunc = servFunc;
        this.servCli = servCli;
    }
    
    @GetMapping(path = "/projetos")
    public List<Projeto> Listaprojetos(){
        return serv.ListAll();
    }

    @PostMapping(path = "/projetos")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody ProjetoDTO projeto) {
        if(Usuario.validarUsuario(login, senha)){
            Funcionario func = servFunc.ListOne(projeto.getFuncionarioResponsavelId());
            Cliente cli = servCli.ListOne(projeto.getEmpresaClienteId());
            
            Projeto proj = new Projeto();
            proj.setDataInicio(projeto.getDataInicio());
            proj.setDataPrevisaoEntrega(projeto.getDataPrevisaoEntrega());
            proj.setDescricao(projeto.getDescricao());
            proj.setEmpresaClienteId(cli);
            proj.setFuncionarioResponsavelId(func);
            proj.setNomeProjeto(projeto.getNomeProjeto());
            proj.setPrioridade(projeto.getPrioridade());
            proj.setStatus(projeto.getStatus());

            serv.AddProj(proj);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/projetos")
    public ResponseEntity<String> deleteProj(@RequestParam long id){
        serv.DeleteProj(id);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/projetos")
    public ResponseEntity<String> updateProj(@RequestParam long id, @RequestBody ProjetoDTO json){
        serv.UpdateProj(id,json);
        return ResponseEntity.ok("Ok");
    }
}
