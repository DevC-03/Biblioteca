package com.example.prac.biblioteca.service;

import com.example.prac.biblioteca.model.Libro;
import com.example.prac.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceimp implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro findById(Integer id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Libro libro) {
        libroRepository.delete(libro);
    }

    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll(); // Método para listar todos los libros
    }
}
