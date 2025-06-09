package com.example.prac.biblioteca.service;

import com.example.prac.biblioteca.model.Autor;
import java.util.List;

public interface AutorService {

    Autor save(Autor autor);

    Autor findById(Integer id);

    void delete(Autor autor);

    List<Autor> findAll(); // Agregar método para listar todos los autores
}
