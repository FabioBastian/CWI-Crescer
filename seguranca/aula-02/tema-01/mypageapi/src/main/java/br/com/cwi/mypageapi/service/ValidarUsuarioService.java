package br.com.cwi.mypageapi.service;

import br.com.cwi.mypageapi.security.domain.Usuario;
import br.com.cwi.mypageapi.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ValidarUsuarioService {

    public static final String MENSAGEM_ERRO = "Usuario não encontrado.";
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(Long idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, MENSAGEM_ERRO));
    }
}
