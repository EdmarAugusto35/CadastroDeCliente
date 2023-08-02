package io.github.EdmarAugusto35.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {
    private Integer idCliente;
    private String descricao;
    private String preco;
    private String data;
}
