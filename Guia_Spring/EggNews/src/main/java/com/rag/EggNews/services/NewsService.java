/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.EggNews.services;

import com.rag.EggNews.entities.News;
import com.rag.EggNews.repositories.NewsRepository;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class NewsService {
    
    @Autowired
    private NewsRepository newsRepository;
    
    @Transactional
    public void createNews(String title, String summary, String body, String picture) {
        try {
            News news = new News();
            news.setTitle(title);
            news.setSummary(summary);
            news.setBody(body);
            news.setPicture(picture);
            newsRepository.save(news);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<News> listNews() {
        List <News> newsList = new ArrayList();
        newsList = newsRepository.findAll();
        return newsList;
    }
    
    public News findById (Long id) {
        News news = new News();
        news = newsRepository.findById(id).orElse(null);
        return news;
    }
    
    @Transactional
    public void editNews(Long id, String title, String summary, String body, String picture) {
        News news = new News();
        news = newsRepository.findById(id).orElse(null);
        if (news != null) {
            news.setTitle(title);
            news.setSummary(summary);
            news.setBody(body);
            news.setPicture(picture);
            newsRepository.save(news);
        } else {
            System.out.println("Error: ID " + id + " was not found.");
        }
    }
    
    @Transactional
    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }
}
