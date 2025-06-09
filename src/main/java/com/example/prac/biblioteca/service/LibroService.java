package com.example.prac.biblioteca.service;

import com.example.prac.biblioteca.model.Libro;
import java.util.List;

public interface LibroService {

    Libro save(Libro libro);

    Libro findById(Integer id);

    void delete(Libro libro);

    List<Libro> findAll(); // Agregar método para listar todos los libros
}
