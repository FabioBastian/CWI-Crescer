package br.com.cwi.mypageapi.controller.response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ListarRelacaoResponse {

    private Long id;

    private String nomeCompleto;

    private String imagem;
}
