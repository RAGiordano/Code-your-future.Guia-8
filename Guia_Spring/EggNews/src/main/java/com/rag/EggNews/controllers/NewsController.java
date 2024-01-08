package com.rag.EggNews.controllers;

import com.rag.EggNews.entities.News;
import com.rag.EggNews.exceptions.MyException;
import com.rag.EggNews.services.NewsService;
import com.rag.EggNews.services.SystemUserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Usuario
 */
@Controller
//@RequestMapping("/")
public class NewsController {
    
//    @GetMapping("/")
//    public String index() {
//        return "index.html";
//    }
    
    @Autowired
    private NewsService newsService;

    @Autowired
    private SystemUserService systemUserService;
    
     // ------------------------ REGISTER USER ------------------------
    @GetMapping("/register")
    public String register() {
        return "register.html";
    }
    
    @PostMapping("/register")
    public String register( @RequestParam String email,
                            @RequestParam String password,
                            @RequestParam String password2,
                            ModelMap model) {
        try {
            systemUserService.register(email, password, password2);
            model.put("success", "Registration successful");
            return "redirect:index.html";
        } catch (MyException e) {
            //Logger.getLogger(NewsController.class.getName()).log(Level.SEVERE, null, e);
            model.put("error", e.getMessage());
            //model.put("error", "eRRor");
            model.put("email", email);
            
            return "register.html";
        }
    }
    
    // ------------------------ LOGIN ------------------------
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    

    // ------------------------ LIST NEWS ------------------------
    
    @GetMapping("/")
    public String index(Model model) {
        try {
            // Obtener la lista de noticias
            List<News> newsList = newsService.listNews();

            // Asignar la lista al modelo, incluso si está vacía
            model.addAttribute("news", newsList);

            return "index.html";
        } catch (Exception e) {
            // Manejar la excepción de manera adecuada (por ejemplo, registrándola)
            e.printStackTrace();
            model.addAttribute("error", "Se produjo un error al cargar las noticias.");
            return "error.html";
        }
    }

    
    // ------------------------ FIND NEWS BY ID ------------------------
    
    @GetMapping("/news/{id}")
    public String showNoticia(@PathVariable Long id, Model model) {
        // Get the news by id and add it to the model
        News news = newsService.findById(id);
        model.addAttribute("news", news);
        return "news.html";
    }

//    @GetMapping("/adminPanel")
//    public String showAdminPanel() {
//        return "adminPanel.html";
//    }
    
    
    // ------------------------ UPLOAD NEWS ------------------------
    
    @GetMapping("/uploadNewsForm")
    public String showUploadNewsForm() {
        return "uploadNewsForm.html";
    }

    @PostMapping("/uploadNews")
    public String uploadNews(@RequestParam String title, @RequestParam String summary, @RequestParam String body, @RequestParam String picture) {
        // Call the service in order to create the news
        newsService.createNews(title, summary, body, picture);

        // Return to de index page
        return "redirect:/";
    }
    
    // ------------------------ DELETE NEWS ------------------------
    
    @RequestMapping(value = "/deleteNews/{id}")
    public String deleteNews(@PathVariable Long id) {
        newsService.deleteNews(id);
        return "redirect:/";
    }
    
    
    
    // ------------------------ CONTROL PANEL ------------------------
    
    @GetMapping("/cpanel")
    public String redirectToCPanel(Model model) {
        try {
            // Obtener la lista de noticias
            List<News> newsList = newsService.listNews();

            // Asignar la lista al modelo, incluso si está vacía
            model.addAttribute("news", newsList);

            return "cpanel.html";
        } catch (Exception e) {
            // Manejar la excepción de manera adecuada (por ejemplo, registrándola)
            e.printStackTrace();
            model.addAttribute("error", "Se produjo un error al cargar las noticias.");
            return "error.html";
        }
        
    }
    
    
    // ------------------------ EDIT NEWS ------------------------
    
    @GetMapping("/editNewsForm/{id}")
    public String showEditNewsForm(@PathVariable Long id, Model model) {
        // Obtener la noticia por ID y agregarla al modelo
        News news = newsService.findById(id);
        model.addAttribute("newsItem", news);
        return "editNewsForm.html";
    }

    @PostMapping("/editNews/{id}")
    public String editNews(@PathVariable Long id, @RequestParam String title, @RequestParam String summary, @RequestParam String body, @RequestParam String picture) {
        // Llamar al servicio para modificar la noticia
        newsService.editNews(id, title, summary, body, picture);

        // Redirigir a la página principal
        return "redirect:/";
    }
}
