package com.oesdev.gestionAutores.service;

import com.oesdev.gestionAutores.dto.request.AutorDto;
import com.oesdev.gestionAutores.dto.response.MessageResponseDto;
import com.oesdev.gestionAutores.entity.Author;
import com.oesdev.gestionAutores.repository.IAutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImp implements IAutorService{

    private IAutorRepository repository;

    public AutorServiceImp(IAutorRepository repository) {
        this.repository = repository;
    }


    @Override
    public MessageResponseDto create(AutorDto dto) {

        Author a = new Author();
        a.setFullName(dto.getFullName());
        a.setDateBirth(dto.getDateBirth());
        a.setIdBooksList(dto.getIdBooksList());

        this.repository.save(a);

        return new MessageResponseDto("Author successfully created!");
    }

    @Override
    public AutorDto read(Long id) {

        Author a = this.repository.findById(id).orElse(null);

        AutorDto aDto = new AutorDto();
        aDto.setFullName(a.getFullName());
        aDto.setDateBirth(a.getDateBirth());
        aDto.setIdBooksList(a.getIdBooksList());

        return aDto;
    }

    @Override
    public List<AutorDto> readList() {

        List<Author> autors = this.repository.findAll();

        return autors.stream()
                .map(autor -> new AutorDto(autor.getFullName(), autor.getDateBirth(), autor.getIdBooksList()))
                .toList();

    }

    @Override
    public MessageResponseDto update(Long id, AutorDto dto) {

        Author a = this.repository.findById(id).orElse(null);

        a.setFullName(dto.getFullName());
        a.setIdBooksList(dto.getIdBooksList());

        this.repository.save(a);

        return new MessageResponseDto("Author successfully updated!");
    }

    @Override
    public MessageResponseDto delete(Long id) {
        this.repository.deleteById(id);
        return new MessageResponseDto("Author successfully deleted!");
    }
}
