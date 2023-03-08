package br.com.cwi.mypageapi.controller.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class AlterarUsuarioRequest {

    @NotBlank
    private String nome;

    private String imagem;

}
