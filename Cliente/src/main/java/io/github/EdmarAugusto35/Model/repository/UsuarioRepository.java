package io.github.EdmarAugusto35.Model.repository;

import io.github.EdmarAugusto35.Model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
