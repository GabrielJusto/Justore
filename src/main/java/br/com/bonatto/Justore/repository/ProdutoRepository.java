package br.com.bonatto.Justore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bonatto.Justore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByNome(String nome);
}
