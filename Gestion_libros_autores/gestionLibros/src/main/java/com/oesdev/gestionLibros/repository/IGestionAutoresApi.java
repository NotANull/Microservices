package com.oesdev.gestionLibros.repository;

import com.oesdev.gestionLibros.dto.response.AuthorDtoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "authorapi", url = "localhost:8080/autor")
public interface IGestionAutoresApi {

    @GetMapping("/read/{fullname}")
    AuthorDtoResponse getAuthorByFullName(@PathVariable String fullname);
}
