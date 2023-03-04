package br.com.cwi.oldfood.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name ="pessoa_id")
    private Pessoa pessoa;
}
