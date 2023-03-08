package br.com.cwi.mypageapi.controller.response;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class DetalharUsuarioResponse {

    private Long id;

    private String nome;

    private String email;

    private LocalDateTime dataAtualizacao;

    private String imagem;
}
