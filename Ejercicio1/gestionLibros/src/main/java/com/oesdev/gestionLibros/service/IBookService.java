package com.oesdev.gestionLibros.service;

import com.oesdev.gestionLibros.dto.request.BookDtoRequest;
import com.oesdev.gestionLibros.dto.response.AuthorDtoResponse;

import java.util.List;

public interface IBookService {

    List<AuthorDtoResponse> create (BookDtoRequest dto);

}
