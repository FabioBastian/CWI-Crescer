package br.com.cwi.oldfood.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String descricao;

    @ManyToMany(mappedBy = "enderecos")
    private List<Pessoa> pessoas = new ArrayList<>();
}
