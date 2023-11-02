/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import entities.Publisher;

/**
 *
 * @author Usuario
 */
public class PublisherDAO extends DAO<Publisher>{
        @Override
    public void save(Publisher publisher) {
        super.save(publisher);
    }

    public void delete(Long id) {
        Publisher publisher = findById(id);
        super.delete(publisher);
    }
    
    public Publisher findById(Long id) {
        connect();
        Publisher publisher = (Publisher) em.createQuery("SELECT p FROM Publisher p WHERE p.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        disconnect();
        return publisher;
    }
}
