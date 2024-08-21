package com.oesdev.gestionLibros.service;

import com.oesdev.gestionLibros.dto.request.BookDtoRequest;
import com.oesdev.gestionLibros.dto.response.AuthorDtoResponse;
import com.oesdev.gestionLibros.repository.IBookRepository;
import com.oesdev.gestionLibros.repository.IGestionAutoresApi;
import org.springframework.stereotype.Service;

import com.oesdev.gestionLibros.entity.Book;

import java.util.List;

@Service
public class BookServieImp implements IBookService{

    private IBookRepository repository;
    private IGestionAutoresApi api;

    public BookServieImp(IBookRepository repository, IGestionAutoresApi api) {
        this.repository = repository;
        this.api = api;
    }

    @Override
    public List<AuthorDtoResponse> create(BookDtoRequest dto) {

        //Objeto entidad que se va a guardar en la db
        Book b = new Book();
        b.setTitle(dto.getTitle());
        b.setDescription(dto.getDescription());
        b.setPubliDate(dto.getPubliDate());
        b.setAuthorList(dto.getAuthorList());

        this.repository.save(b); //Guardo el objeto entidad en la db

        return dto.getAuthorList().stream()
                .map(author ->
                        )

    }
}
