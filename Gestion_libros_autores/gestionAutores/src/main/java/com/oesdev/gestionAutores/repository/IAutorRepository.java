package com.oesdev.gestionAutores.repository;

import com.oesdev.gestionAutores.entity.Author;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.fullName = :fullName")
    Author findAuthorByFullName(@Param("fullName") String fullName);

    /*
    @Query("SELECT b FROM Book b WHERE b.title = :title")
    List<Book> findBooksByTitle(@Param("title") String title);
     */
}
