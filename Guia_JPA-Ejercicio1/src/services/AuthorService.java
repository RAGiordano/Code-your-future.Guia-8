/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Author;
import java.util.List;
import persistence.AuthorDAO;

/**
 *
 * @author Usuario
 */
public class AuthorService {
    private final AuthorDAO DAO;
    
    public AuthorService() {
        this.DAO = new AuthorDAO();
    }
    
    public Author createAuthor(String name, Boolean active) {
        Author author = new Author();
        try {
            author.setName(name);
            author.setActive(active);
            DAO.save(author);
            return author;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List findAuthorByName(String name) {
        Author author = new Author();
        try {
            author.setName(name);
            author.setActive(active);
            DAO.save(author);
            return author;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
