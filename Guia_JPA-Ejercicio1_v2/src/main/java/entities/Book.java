/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 *
 * @author RAG
 */
@Entity
public class Book {
    // ---------------- Attributes ----------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String title;
    private Integer year;
    private Integer copies;
    private Integer borrowedCopies;
    private Integer remainingCopies;
    private Boolean active;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;
    
    // ---------------- Constructors ----------------

    public Book() {
    }

    public Book(Long id, String isbn, String title, Integer year, Integer copies, Integer borrowedCopies, Integer remainingCopies, Boolean active, Author author, Publisher publisher) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.copies = copies;
        this.borrowedCopies = borrowedCopies;
        this.remainingCopies = remainingCopies;
        this.active = active;
        this.author = author;
        this.publisher = publisher;
    }
    
    // ---------------- Getters & Setters ----------------
    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    public Integer getRemainingCopies() {
        return remainingCopies;
    }

    public void setRemainingCopies(Integer remainingCopies) {
        this.remainingCopies = remainingCopies;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
}
