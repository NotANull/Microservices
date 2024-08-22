package com.oesdev.gestionAutores.repository;

import com.oesdev.gestionAutores.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Author, Long> {
}
