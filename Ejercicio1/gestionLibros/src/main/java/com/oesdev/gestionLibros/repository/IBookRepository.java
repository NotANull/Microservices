package com.oesdev.gestionLibros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oesdev.gestionLibros.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
