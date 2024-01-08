package com.rag.EggNews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Ricardo A. Giordano
 */

@Entity
@Table(name = "news")  // Name of the database
public class News {
    //-------------------- Attributes --------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String summary;
    @Lob
    private String body;
    private String picture;
    
    //-------------------- Constructors --------------------
    public News() {
        }
    
    
    public News(String title, String summary, String body, String picture) {
        this.title = title;
        this.summary = summary;
        this.body = body;
        this.picture = picture;
    }
    

    //-------------------- Getters & Setters --------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
}
