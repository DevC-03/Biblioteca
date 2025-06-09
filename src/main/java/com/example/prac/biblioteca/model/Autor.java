package com.example.prac.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @Column(name="idautor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    @Column(name="nombres")
    private String nombres;

    @Column(name="primerApellido")
    private String primerApellido;

    @Column(name="segundoApellido")
    private String segundoApellido;

    @Column(name="dni", unique = true)
    private Integer dni;

    @Column(name="profesion")
    private String profesion;

    @ManyToOne
    @JoinColumn(name = "idLibro", referencedColumnName = "idLibro")
    private Libro libro; // Relación con la clase Libro
}

//http://localhost:8080/autores