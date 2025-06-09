package com.example.prac.biblioteca.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Libro")
public class Libro {

    @Id
    @Column(name="idlibro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibro;

    @Column(name="nombre")
    private String nombre;

    @Column(name="isbn")
    private String isbn;

    @Column(name="paginas")
    private Integer paginas;

    @Column(name="fechaPublicacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaPublicacion;

}

//http://localhost:8080/libros
