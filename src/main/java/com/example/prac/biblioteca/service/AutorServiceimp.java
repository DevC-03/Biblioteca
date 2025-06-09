package com.example.prac.biblioteca.service;

import com.example.prac.biblioteca.model.Autor;
import com.example.prac.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceimp implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public Autor findById(Integer id) {
        return autorRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Autor autor) {
        autorRepository.delete(autor);
    }

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll(); // Método para listar todos los autores
    }
}
