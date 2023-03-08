package br.com.cwi.mypageapi.security.repository;

import br.com.cwi.mypageapi.security.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    @Query("select u from Usuario u where u.ativo = true and lower(u.nome) like %:searchTerm% or lower(u.email) like %:searchTerm%")
    Page<Usuario> findAllBySearchTerm(@Param("searchTerm") String searchTerm, Pageable pageable);
}
