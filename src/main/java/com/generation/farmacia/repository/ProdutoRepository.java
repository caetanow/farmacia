package com.generation.farmacia.repository;

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
    public List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
