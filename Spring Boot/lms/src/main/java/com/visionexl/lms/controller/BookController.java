package com.visionexl.lms.controller;

import com.visionexl.lms.model.Book;
import com.visionexl.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller is responsible to handle all the /books related URLs
 * GET /books -> should return all the books
 * POST /books -> should save the book
 * DELETE /books/id -> should delete the book
 * PATH /book/id -> Update the existing book
 * GET /books/id -> Should return only one book with matching id
 * GET /books (Filters) ->  Filter all the books by same author / provided author name.
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/health")
    public String healthOfBookController() {
        return "Book controller can be accessed";
    }

    /**
     * GET /books -> should return all the books
     */
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    /**
     * POST /books -> should save the book
     */
    @PostMapping
    public Book saveBook(@RequestBody Book book) {
       return bookService.saveBook(book);
    }

    /**
     * DELETE /books/id -> should delete the book
     */
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable("id") int bookId) { // Path (URL) Variable (value)
       return bookService.deleteBook(bookId);
    }

    /**
     * PATH /book/id -> Update the existing book
     */
    @PatchMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }


















}
