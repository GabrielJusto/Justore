package br.com.bonatto.Justore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bonatto.Justore.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	List<Usuario> findByUsuario(String usuario);

	
}
