/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Publisher;
import persistence.PublisherDAO;

/**
 *
 * @author Usuario
 */
public class PublisherService {
    private final PublisherDAO DAO;
    
    public PublisherService() {
        this.DAO = new PublisherDAO();
    }
    
    public Publisher createPublisher(String name, Boolean active) {
        Publisher publisher = new Publisher();
        try {
            publisher.setName(name);
            publisher.setActive(active);
            DAO.save(publisher);
            return publisher;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
