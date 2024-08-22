package com.oesdev.gestionAutores.service;

import com.oesdev.gestionAutores.dto.request.AutorDto;
import com.oesdev.gestionAutores.dto.response.MessageResponseDto;

import java.util.List;

public interface IAutorService {

    MessageResponseDto create(AutorDto dto);

    AutorDto read(Long id);

    List<AutorDto> readList();

    MessageResponseDto update(Long id, AutorDto dto);

    MessageResponseDto delete(Long id);
}
