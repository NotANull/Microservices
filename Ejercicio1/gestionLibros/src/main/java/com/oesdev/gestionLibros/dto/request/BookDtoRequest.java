package com.oesdev.gestionLibros.dto.request;

import com.oesdev.gestionLibros.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDtoRequest {

    private String title;
    private LocalDate publiDate;
    private String description;
    private List<Author> authorList;
}
