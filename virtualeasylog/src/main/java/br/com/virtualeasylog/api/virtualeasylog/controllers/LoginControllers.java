package br.com.virtualeasylog.api.virtualeasylog.controllers;
import br.com.virtualeasylog.api.virtualeasylog.models.Login;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginControllers {

    @Autowired
    private EmpresaRepository empresaRepository;

    @CrossOrigin
    @PostMapping("/usuario")
    public String login(@RequestBody Login loginRequisição) {
        String email = loginRequisição.getEmail();
        String senha = loginRequisição.getSenha();

        boolean acesso = empresaRepository.existsByEmailAndSenha(email, senha);
        if (acesso) {
            return "Login realizado com sucesso para o email: " + email;
        } else {
            return "Email ou senha inválidos";
        }
    }
}
