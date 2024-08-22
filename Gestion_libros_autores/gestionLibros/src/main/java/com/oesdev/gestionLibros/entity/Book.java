package com.oesdev.gestionLibros.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    private String title;
    private LocalDate publiDate;
    private String description;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Author> authorList; //Fixear
}
