package com.victor.usuario.infraestructure.Entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Endereco")
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private Long numero;

    @Column(name = "complemento", length = 20)
    private String complemento;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "cep", length = 10)
    private String cep;

}
