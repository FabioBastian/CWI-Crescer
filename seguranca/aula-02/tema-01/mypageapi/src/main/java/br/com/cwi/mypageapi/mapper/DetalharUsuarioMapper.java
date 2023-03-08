package br.com.cwi.mypageapi.mapper;

import br.com.cwi.mypageapi.controller.response.DetalharUsuarioResponse;
import br.com.cwi.mypageapi.security.domain.Usuario;

public class DetalharUsuarioMapper {

    public static DetalharUsuarioResponse toResponse(Usuario entity) {
        return DetalharUsuarioResponse.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .email(entity.getEmail())
                .dataAtualizacao(entity.getDataAtualizacao())
                .imagem(entity.getImagem())
                .build();
    }
}
