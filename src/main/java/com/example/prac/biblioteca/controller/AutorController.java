package com.example.prac.biblioteca.controller;

import com.example.prac.biblioteca.model.Autor;
import com.example.prac.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public String listarAutores(Model model) {
        List<Autor> autores = autorService.findAll();
        model.addAttribute("autores", autores);
        return "autor/listar";
    }

    @GetMapping("/nuevo")
    public String nuevoAutorForm(Model model) {
        model.addAttribute("autor", new Autor());
        return "autor/nuevo";
    }

    @PostMapping
    public String guardarAutor(@ModelAttribute Autor autor) {
        autorService.save(autor);
        return "redirect:/autores";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarAutor(@PathVariable Integer id) {
        Autor autor = autorService.findById(id);
        if (autor != null) {
            autorService.delete(autor);
        }
        return "redirect:/autores";
    }
}
