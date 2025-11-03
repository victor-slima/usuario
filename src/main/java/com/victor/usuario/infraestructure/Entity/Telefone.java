package com.victor.usuario.infraestructure.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
@Builder
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "ddd", length = 3, nullable = false)
    private String ddd;
}
