package br.com.cwi.mypageapi.security.controller;

import br.com.cwi.mypageapi.security.controller.request.UsuarioRequest;
import br.com.cwi.mypageapi.security.controller.response.UsuarioResponse;
import br.com.cwi.mypageapi.security.service.IncluirUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class UsuarioControllerSecurity {

    @Autowired
    private IncluirUsuarioService service;

    @PostMapping
    public UsuarioResponse incluir(@Valid @RequestBody UsuarioRequest request) {
        return service.incluir(request);
    }
}
