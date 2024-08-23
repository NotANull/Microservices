package com.oesdev.gestionAutores.controller;

import com.oesdev.gestionAutores.dto.request.AutorDto;
import com.oesdev.gestionAutores.dto.response.AuthorDtoResponse;
import com.oesdev.gestionAutores.dto.response.MessageResponseDto;
import com.oesdev.gestionAutores.service.IAutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    private IAutorService service;

    public AutorController(IAutorService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public MessageResponseDto create(@RequestBody AutorDto dto) {
        return this.service.create(dto);
    }

    @GetMapping("/read/{id}")
    public AutorDto read(@PathVariable Long id) {
        return this.service.read(id);
    }

    @GetMapping("/read")
    public List<AutorDto> readList() {
        return this.service.readList();
    }

    @GetMapping("/read/fullname/{fullname}")
    public AuthorDtoResponse readAuthor(@PathVariable String fullname) {
        return this.service.readAuthorByFullName(fullname);
    }

    @PutMapping("/update/{id}")
    public MessageResponseDto update(@PathVariable Long id, @RequestBody AutorDto dto) {
        return this.service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public MessageResponseDto delete(@PathVariable Long id) {
        return this.service.delete(id);
    }

}
