/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import entities.Book;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BookDAO extends DAO<Book>{
        @Override
    public void save(Book book) {
        super.save(book);
    }

    public void delete(Long id) {
        Book book = findById(id);
        super.delete(book);
    }
    
    public Book findById(Long id) {
        connect();
        Book book = (Book) em.createQuery("SELECT b FROM Book b WHERE b.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        disconnect();
        return book;
    }
    
//    public List<Book> findByIsbn(String isbn) {
//        connect();
//        List<Book> bookList = em.createQuery("SELECT b FROM Book b WHERE b.isbn LIKE :isbn")
//                .setParameter("isbn", "%" + isbn + "%").getResultList();
//        disconnect();
//        return bookList;
//    }
    
    public List<Book> find(String field, String value) {
        connect();
        List<Book> bookList = null;
        if (field.equals("isbn") || field.equals("title")) {
            bookList = em.createQuery("SELECT b FROM Book b WHERE b." + field + " LIKE :value")
                    .setParameter("value", "%" + value + "%")
                    .getResultList();
        } else if (field.equals("author")) {
            bookList = em.createQuery("SELECT b FROM Book b WHERE b.author.name LIKE :value")
                    .setParameter("value", "%" + value + "%")
                    .getResultList();
        } else if (field.equals("publisher")) {
            bookList = em.createQuery("SELECT b FROM Book b WHERE b.publisher.name LIKE :value")
                    .setParameter("value", "%" + value + "%")
                    .getResultList();
        } 
        
        disconnect();
        return bookList;
    }
}
