package com.visionexl.lms.service;

import com.visionexl.lms.dao.BookRepository;
import com.visionexl.lms.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * GET / POST / DELETE / UPDATE
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }


    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return id + " is deleted from the books";
    }

    public Book updateBook(int id, Book book) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        Book savedBook = bookOptional.get();
        if(book.getBookName() != null)
            savedBook.setBookName(book.getBookName());

            savedBook.setAuthorName(book.getAuthorName());

        return bookRepository.save(savedBook);
    }
}
