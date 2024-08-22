package com.oesdev.gestionAutores.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AutorDto {

    private String fullName;
    private LocalDate dateBirth;
    private List<Integer> idBooksList;
}
