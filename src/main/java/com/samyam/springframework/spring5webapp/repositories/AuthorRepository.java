package com.samyam.springframework.spring5webapp.repositories;
import com.samyam.springframework.spring5webapp.modal.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
