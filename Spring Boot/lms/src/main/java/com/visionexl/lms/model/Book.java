package com.visionexl.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// table book
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "book_name", length = 100)
    private String bookName;

    @Column(name = "author_name", length = 50)
    private String authorName;

    @Column(name = "year_of_publication")
    private int yearOfPublication;

    @Column(name = "book_type", length = 20)
    private String bookType;

    public Book() {  }

    public Book(int id, String bookName, String authorName, int yearOfPublication, String bookType) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
        this.bookType = bookType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
