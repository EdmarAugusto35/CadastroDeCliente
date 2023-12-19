package io.github.EdmarAugusto35.Model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // unique serve para mostrar que o nome username nao pode se repetir, name para modificar o nome da variavel
    @Column(unique = true, name = "login")
    private String userName;

    @Column(name = "senha")
    private String password;
}
