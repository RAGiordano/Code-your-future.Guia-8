/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import entities.Author;

/**
 *
 * @author Usuario
 */
public class AuthorDAO extends DAO<Author>{
    
    @Override
    public void save(Author author) {
        super.save(author);
    }

    public void delete(Long id) {
        Author author = findById(id);
        super.delete(author);
    }
    
    public Author findById(Long id) {
        connect();
        Author author = (Author) em.createQuery("SELECT a FROM Author a WHERE a.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        disconnect();
        return author;
    }
}
