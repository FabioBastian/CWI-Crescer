package br.com.cwi.mypageapi.service;

import br.com.cwi.mypageapi.controller.request.AlterarUsuarioRequest;
import br.com.cwi.mypageapi.controller.response.IdResponse;
import br.com.cwi.mypageapi.mapper.IdMapper;
import br.com.cwi.mypageapi.security.domain.Usuario;
import br.com.cwi.mypageapi.security.repository.UsuarioRepository;
import br.com.cwi.mypageapi.security.service.UsuarioAutenticadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlterarUsuarioService {

    @Autowired
    private UsuarioAutenticadoService usuarioAutenticadoService;

    @Autowired
    private ValidarUsuarioService validarUsuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public IdResponse alterar(AlterarUsuarioRequest request) {

        Long idUsuario = usuarioAutenticadoService.getId();
        Usuario usuario = validarUsuarioService.validar(idUsuario);

        usuario.setNome(request.getNome());
        usuario.setImagem(request.getImagem());

        usuarioRepository.save(usuario);

        return IdMapper.toResponse(usuario.getId());
    }
}
