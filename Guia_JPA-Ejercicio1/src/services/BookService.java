/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Author;
import entities.Book;
import entities.Publisher;
import persistence.BookDAO;

/**
 *
 * @author Usuario
 */
public class BookService {
    private final BookDAO DAO;
    
    public BookService() {
        this.DAO = new BookDAO();
    }
    
    public Book createBook(String isbn,
                            String title,
                            Integer year,
                            Integer copies,
                            Integer borrowedCopies,
                            Integer remainingCopies,
                            Boolean active,
                            Author author,
                            Publisher publisher) {
        Book book = new Book();
        try {
            book.setIsbn(isbn);
            book.setTitle(title);
            book.setYear(year);
            book.setCopies(copies);
            book.setBorrowedCopies(borrowedCopies);
            book.setRemainingCopies(remainingCopies);
            book.setActive(active);
            book.setAuthor(author);
            book.setPublisher(publisher);
            DAO.save(book);
            return book;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
