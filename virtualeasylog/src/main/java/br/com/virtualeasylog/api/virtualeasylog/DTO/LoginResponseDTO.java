package br.com.virtualeasylog.api.virtualeasylog.DTO;

import br.com.virtualeasylog.api.virtualeasylog.Interfaces.LoginResponsePayLoad;
import br.com.virtualeasylog.api.virtualeasylog.models.Empresa;
import lombok.Data;

@Data
public class LoginResponseDTO {

    public LoginResponseDTO(LoginResponsePayLoad payLoad){
        this.setId(payLoad.getId());
        this.setIsproprietario(payLoad instanceof Empresa);


    }

    public String id;
    private boolean isproprietario;
}
