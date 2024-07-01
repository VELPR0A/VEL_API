package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Entregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Login;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loginentregador")
public class LoginEntregadorControllers {

    @Autowired
    private EntregadorRepository entregadorRepository;

    @CrossOrigin
    @PostMapping("/usuario")
    public ResponseEntity<?> loginEntregador(@RequestBody Login loginRequesicao) {
        String email = loginRequesicao.getEmail();
        String senha = loginRequesicao.getSenha();

        boolean entregadorExiste = entregadorRepository.existsByEmailAndSenha(email, senha);

        if (entregadorExiste) {
            Entregador entregador = entregadorRepository.findByEmail(email);
            return ResponseEntity.ok(entregador);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha incorretos");
        }
    }
}
