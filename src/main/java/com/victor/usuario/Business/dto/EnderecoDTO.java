package com.victor.usuario.Business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {

    private String rua;

    private Long numero;

    private String complemento;

    private String cidade;

    private String cep;

}
