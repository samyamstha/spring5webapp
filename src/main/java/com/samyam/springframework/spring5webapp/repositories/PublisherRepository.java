package com.samyam.springframework.spring5webapp.repositories;

import com.samyam.springframework.spring5webapp.modal.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
