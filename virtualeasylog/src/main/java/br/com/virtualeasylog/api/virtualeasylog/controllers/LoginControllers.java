package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.DTO.LoginResponseDTO;
import br.com.virtualeasylog.api.virtualeasylog.models.Coordenador;
import br.com.virtualeasylog.api.virtualeasylog.models.Empresa;
import br.com.virtualeasylog.api.virtualeasylog.models.Login;
import br.com.virtualeasylog.api.virtualeasylog.repositories.CoordenadorRepository;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseStatus(HttpStatus.OK)
public class LoginControllers {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @CrossOrigin
    @PostMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody Login loginRequisição) {
        String email = loginRequisição.getEmail();
        String senha = loginRequisição.getSenha();

        Empresa empresa = empresaRepository.existsByEmailAndSenha(email, senha);

        Coordenador coordenador = coordenadorRepository.existsByEmailAndSenha(email, senha);

        if(empresa!= null){
            return ResponseEntity.ok(new LoginResponseDTO(empresa));
        }if(coordenador!= null) {
            return ResponseEntity.ok(new LoginResponseDTO(coordenador));
        }
        return ResponseEntity.badRequest().body("usuario não encontrado");

    }
}
