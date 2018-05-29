package com.samyam.springframework.spring5webapp.repositories;

import com.samyam.springframework.spring5webapp.modal.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
