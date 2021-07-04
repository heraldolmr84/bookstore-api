package com.heraldo.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heraldo.bookstore.domain.Livro;

@Repository
public interface CategoriaRepository extends JpaRepository<Livro, Integer>{

}
