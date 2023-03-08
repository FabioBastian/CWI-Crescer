package br.com.cwi.mypageapi.mapper;

import br.com.cwi.mypageapi.controller.response.ListarRelacaoResponse;
import br.com.cwi.mypageapi.security.domain.Usuario;

public class ListarUsuarioMapper {

    public static ListarRelacaoResponse toResponse(Usuario entity) {
        return ListarRelacaoResponse.builder()
                .id(entity.getId())
                .nomeCompleto(entity.getNome())
                .imagem(entity.getImagem())
                .build();
    }
}
