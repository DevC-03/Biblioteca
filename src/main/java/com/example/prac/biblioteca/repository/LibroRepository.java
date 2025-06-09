package com.example.prac.biblioteca.repository;

import com.example.prac.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
