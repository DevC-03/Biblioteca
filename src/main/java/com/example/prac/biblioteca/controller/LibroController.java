package com.example.prac.biblioteca.controller;

import com.example.prac.biblioteca.model.Libro;
import com.example.prac.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public String listarLibros(Model model) {
        List<Libro> libros = libroService.findAll();
        model.addAttribute("libros", libros);
        return "libro/listar";
    }

    @GetMapping("/nuevo")
    public String nuevoLibroForm(Model model) {
        model.addAttribute("libro", new Libro());
        return "libro/nuevo";
    }

    @PostMapping
    public String guardarLibro(@ModelAttribute Libro libro) {
        libroService.save(libro);
        return "redirect:/libros";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarLibro(@PathVariable Integer id) {
        Libro libro = libroService.findById(id);
        if (libro != null) {
            libroService.delete(libro);
        }
        return "redirect:/libros";
    }
}
