package br.com.cwi.mypageapi.mapper;

import br.com.cwi.mypageapi.controller.response.IdResponse;

public class IdMapper {

    public static IdResponse toResponse(Long id) {
        return IdResponse.builder().id(id).build();
    }
}
