package com.samyam.springframework.spring5webapp.bootstrap;

import com.samyam.springframework.spring5webapp.modal.Author;
import com.samyam.springframework.spring5webapp.modal.Book;
import com.samyam.springframework.spring5webapp.modal.Publisher;
import com.samyam.springframework.spring5webapp.repositories.AuthorRepository;
import com.samyam.springframework.spring5webapp.repositories.BookRepository;
import com.samyam.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher harper = new Publisher("Harper Collins", "");
        Book ddd = new Book("Domain Driven Design", "1234",harper);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisherRepository.save(harper);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher worx = new Publisher("Worx","");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);

        publisherRepository.save(worx);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
