package br.com.cwi.mypageapi.security.mapper;

import br.com.cwi.mypageapi.security.controller.request.UsuarioRequest;
import br.com.cwi.mypageapi.security.controller.response.UsuarioResponse;
import br.com.cwi.mypageapi.security.domain.Usuario;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioRequest request) {
        Usuario entity = new Usuario();
        entity.setNome(request.getNome());
        entity.setEmail(request.getEmail());
        entity.setImagem(request.getImagem());
        return entity;
    }

    public static UsuarioResponse toResponse(Usuario entity) {
        UsuarioResponse response = new UsuarioResponse();
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setEmail(entity.getEmail());
        return response;
    }
}
