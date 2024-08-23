package com.oesdev.gestionAutores.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorDtoResponse {

    private String fullName;
    private LocalDate dateBirth;
}
