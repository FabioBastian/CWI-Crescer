package br.com.cwi.mypageapi.controller;

import br.com.cwi.mypageapi.controller.response.IdResponse;
import br.com.cwi.mypageapi.controller.request.AlterarUsuarioRequest;
import br.com.cwi.mypageapi.controller.response.DetalharUsuarioResponse;
import br.com.cwi.mypageapi.controller.response.ListarRelacaoResponse;
import br.com.cwi.mypageapi.service.AlterarUsuarioService;
import br.com.cwi.mypageapi.service.DetalharUsuarioService;
import br.com.cwi.mypageapi.service.ListarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private AlterarUsuarioService alterarUsuarioService;

    @Autowired
    private DetalharUsuarioService detalharUsuarioService;

    @Autowired
    private ListarUsuarioService listarUsuarioService;


    @PutMapping("/alterar")
    @ResponseStatus(HttpStatus.CREATED)
    public IdResponse alterar(@Valid @RequestBody AlterarUsuarioRequest request) {
        return alterarUsuarioService.alterar(request);
    }

    @GetMapping("/detalhar")
    public DetalharUsuarioResponse detalhar() {
        return detalharUsuarioService.detalhar();
    }

    @GetMapping("/search")
    public Page<ListarRelacaoResponse> listarSearch(@RequestParam(name = "searchTerm") String searchTerm, Pageable pageable){
        return listarUsuarioService.listarSearch(searchTerm, pageable);
    }
}
