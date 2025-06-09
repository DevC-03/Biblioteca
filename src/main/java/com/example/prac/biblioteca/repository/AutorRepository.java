package com.example.prac.biblioteca.repository;

import com.example.prac.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
