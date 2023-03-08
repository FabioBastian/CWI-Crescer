package br.com.cwi.mypageapi.service;

import br.com.cwi.mypageapi.controller.response.DetalharUsuarioResponse;
import br.com.cwi.mypageapi.mapper.DetalharUsuarioMapper;
import br.com.cwi.mypageapi.security.domain.Usuario;
import br.com.cwi.mypageapi.security.service.UsuarioAutenticadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalharUsuarioService {

    @Autowired
    private UsuarioAutenticadoService usuarioAutenticadoService;

    @Autowired
    private ValidarUsuarioService validarUsuarioService;

    public DetalharUsuarioResponse detalhar() {

        Long idUsuario = usuarioAutenticadoService.getId();
        Usuario usuario = validarUsuarioService.validar(idUsuario);

        return DetalharUsuarioMapper.toResponse(usuario);
    }
}
