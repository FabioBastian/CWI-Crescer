package br.com.cwi.mypageapi.service;

import br.com.cwi.mypageapi.controller.response.ListarRelacaoResponse;
import br.com.cwi.mypageapi.mapper.ListarUsuarioMapper;
import br.com.cwi.mypageapi.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListarUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Page<ListarRelacaoResponse> listarSearch(String searchTerm, Pageable pageable) {

        return usuarioRepository.findAllBySearchTerm(searchTerm.toLowerCase(), pageable)
                .map(ListarUsuarioMapper::toResponse);
    }
}
