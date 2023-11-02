/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import entities.Book;

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
}
