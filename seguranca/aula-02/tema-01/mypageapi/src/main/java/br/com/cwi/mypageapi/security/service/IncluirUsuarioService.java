package br.com.cwi.mypageapi.security.service;

import br.com.cwi.mypageapi.security.controller.request.UsuarioRequest;
import br.com.cwi.mypageapi.security.controller.response.UsuarioResponse;
import br.com.cwi.mypageapi.security.domain.Permissao;
import br.com.cwi.mypageapi.security.domain.Usuario;
import br.com.cwi.mypageapi.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static br.com.cwi.mypageapi.security.domain.Funcao.USUARIO;
import static br.com.cwi.mypageapi.security.mapper.UsuarioMapper.toEntity;
import static br.com.cwi.mypageapi.security.mapper.UsuarioMapper.toResponse;

@Service
public class IncluirUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UsuarioResponse incluir(UsuarioRequest request) {

        Usuario usuario = toEntity(request);
        usuario.setSenha(getSenhaCriptografada(request.getSenha()));
        usuario.adicionarPermissao(getPermissaoPadrao());
        usuario.setAtivo(true);

        usuarioRepository.save(usuario);

        return toResponse(usuario);
    }

    private String getSenhaCriptografada(String senhaAberta) {
        return passwordEncoder.encode(senhaAberta);
    }

    private Permissao getPermissaoPadrao() {
        Permissao permissao = new Permissao();
        permissao.setFuncao(USUARIO);
        return permissao;
    }
}
