package com.oesdev.gestionLibros.controller;

import com.oesdev.gestionLibros.dto.request.BookDtoRequest;
import com.oesdev.gestionLibros.dto.response.AuthorDtoResponse;
import com.oesdev.gestionLibros.service.IBookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class BookController {

    private IBookService service;

    public BookController(IBookService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public List<AuthorDtoResponse> createBook(@RequestBody BookDtoRequest dto) {
        return this.service.create(dto); //Prueba comentario
    }
}
