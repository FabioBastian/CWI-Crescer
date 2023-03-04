package br.com.cwi.oldfood.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="pessoa_id")
    private Pessoa pessoa;
}
