/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import entities.Author;
import entities.Publisher;
import java.util.Scanner;
import services.AuthorService;
import services.BookService;
import services.PublisherService;

/**
 *
 * @author Usuario
 */
public class Guia_JPAEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
        
        String option = "";
        String enter = "";
        loadData();
        
        do {
            System.out.println(" ____________________");
            System.out.println("|                    |");
            System.out.println("|        MENÚ        |");
            System.out.println("|____________________|");
            System.out.println("");
            System.out.println("(1) Buscar autor por nombre");
            System.out.println("(2) Buscar libro por ISBN");
            System.out.println("(3) Buscar libro por título");
            System.out.println("(4) Buscar libro/s por nombre de autor");
            System.out.println("(5) Buscar libro/s por nombre de editorial");
            System.out.println("(6) Salir del sistema");
            
            option = read.next();
            
            switch (option) {
                case "1":
                    findAuthorByName();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "2":
                    findBookByISBN();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "3":
                    findBookByTitle();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "4":
                    findBooksByAuthor();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "5":
                    findBooksByPublisher();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;

            }
            
        } while (!option.equals("6"));
        
        System.out.println("");
        System.out.println("Usted ha salido del sistema."); 
    }
    
    private static void loadData() {
        BookService bookService = new BookService();
        AuthorService authorService = new AuthorService();
        PublisherService publisherService = new PublisherService();
        
        Author author1 = authorService.createAuthor("Sir Arthur Connan Doyle", true);
        Publisher publisher1 = publisherService.createPublisher("George Newnes Ltd", true);
        
        bookService.createBook("9788420739533", // ISBN
                                "Las aventuras de Sherlock Holmes", // Title
                                1892, // Year
                                3, // Copies
                                0, // Borrowed copies
                                3, // Remaining copies
                                Boolean.TRUE, // Active
                                author1, // Author
                                publisher1); // Publisher
        
    }
    
    private static void findAuthorByName() {
        System.out.println("");
    }
    
    private static void findBookByISBN() {
        System.out.println("");
    }
    
    private static void findBookByTitle() {
        System.out.println("");
    }
    
    private static void findBooksByAuthor() {
        System.out.println("");
    }
    
    private static void findBooksByPublisher() {
        System.out.println("");
    }
    
    
}
