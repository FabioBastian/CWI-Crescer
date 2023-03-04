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
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @OneToMany(mappedBy = "pessoa")
    private List<Telefone> telefones = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa")
    private List<Pagamento> pagamento = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "pessoa_endereco",
            joinColumns = @JoinColumn(name = "pessoa_id"),
            inverseJoinColumns = @JoinColumn(name = "endereco_id")
    )
    private List<Endereco> enderecos = new ArrayList<>();
}
