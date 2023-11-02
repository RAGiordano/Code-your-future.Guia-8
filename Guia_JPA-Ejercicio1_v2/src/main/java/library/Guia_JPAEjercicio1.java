/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import entities.Author;
import entities.Book;
import entities.Publisher;
import java.util.List;
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
                    findAuthorsByName();
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "2":
                    //findBooksByISBN();
                    findBooks("isbn");
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "3":
                    //findBooksByTitle();
                    findBooks("title");
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "4":
                    //findBooksByAuthor();
                    findBooks("author");
                    System.out.println("");
                    System.out.println("Presione <ENTER> para continuar");
                    enter = read.next();
                    break;
                case "5":
                    //findBooksByPublisher();
                    findBooks("publisher");
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

//        // Authors
//        Author author1 = authorService.createAuthor("Sir Arthur Connan Doyle", true);
//        Author author2 = authorService.createAuthor("Herman Melville", true);
//        Author author3 = authorService.createAuthor("Jack London", true);
//        
//        // Publishers
//        Publisher publisher1 = publisherService.createPublisher("George Newnes Ltd", true);
//        Publisher publisher2 = publisherService.createPublisher("Ediciones Colihue", true);
//        Publisher publisher3 = publisherService.createPublisher("Alianza", true);
//        
//        
//        // Books
//        bookService.createBook("9788420739533", // ISBN
//                                "Las aventuras de Sherlock Holmes", // Title
//                                2005, // Year
//                                3, // Copies
//                                0, // Borrowed copies
//                                3, // Remaining copies
//                                Boolean.TRUE, // Active
//                                author1, // Author
//                                publisher1); // Publisher
//        
//        bookService.createBook("978-950-563-076-9", // ISBN
//                                "Moby Dick", // Title
//                                2016, // Year
//                                2, // Copies
//                                0, // Borrowed copies
//                                2, // Remaining copies
//                                Boolean.TRUE, // Active
//                                author2, // Author
//                                publisher2); // Publisher
//        
//        bookService.createBook("9788491040682", // ISBN
//                                "Colmillo Blanco", // Title
//                                2009, // Year
//                                5, // Copies
//                                0, // Borrowed copies
//                                5, // Remaining copies
//                                Boolean.TRUE, // Active
//                                author3, // Author
//                                publisher3); // Publisher
//    }
// Authors
        Author author1 = authorService.createAuthor("Sir Arthur Conan Doyle", true);
        Author author2 = authorService.createAuthor("Herman Melville", true);
        Author author3 = authorService.createAuthor("Jack London", true);
        Author author4 = authorService.createAuthor("George Orwell", true);
        Author author5 = authorService.createAuthor("F. Scott Fitzgerald", true);
        Author author6 = authorService.createAuthor("Gabriel García Márquez", true);
        Author author7 = authorService.createAuthor("Mark Twain", true);
        Author author8 = authorService.createAuthor("Emily Brontë", true);
        Author author9 = authorService.createAuthor("Franz Kafka", true);
        Author author10 = authorService.createAuthor("J.K. Rowling", true);
        Author author11 = authorService.createAuthor("Agatha Christie", true);
        Author author12 = authorService.createAuthor("Toni Morrison", true);
        Author author13 = authorService.createAuthor("H.G. Wells", true);
        Author author14 = authorService.createAuthor("Jules Verne", true);
        Author author15 = authorService.createAuthor("Harper Lee", true);
        Author author16 = authorService.createAuthor("Ernest Hemingway", true);
        Author author17 = authorService.createAuthor("Virginia Woolf", true);
        Author author18 = authorService.createAuthor("Albert Camus", true);
        Author author19 = authorService.createAuthor("Jane Austen", true);
        Author author20 = authorService.createAuthor("Leo Tolstoy", true);
        Author author21 = authorService.createAuthor("Fyodor Dostoevsky", true);
        Author author22 = authorService.createAuthor("Emily Brontë", true);
        Author author23 = authorService.createAuthor("Joseph Conrad", true);
        Author author24 = authorService.createAuthor("F. Scott Fitzgerald", true);
        Author author25 = authorService.createAuthor("Virginia Woolf", true);
        Author author26 = authorService.createAuthor("J.R.R. Tolkien", true);
        Author author27 = authorService.createAuthor("Toni Morrison", true);
        Author author28 = authorService.createAuthor("Jules Verne", true);
        Author author29 = authorService.createAuthor("H.P. Lovecraft", true);
        Author author30 = authorService.createAuthor("Hermann Hesse", true);
        Author author31 = authorService.createAuthor("Gabriel García Márquez", true);
        Author author32 = authorService.createAuthor("Leo Tolstoy", true);
        Author author33 = authorService.createAuthor("Jane Austen", true);
        Author author34 = authorService.createAuthor("Charles Dickens", true);
        Author author35 = authorService.createAuthor("J.D. Salinger", true);
        Author author36 = authorService.createAuthor("Aldous Huxley", true);
        Author author37 = authorService.createAuthor("George Orwell", true);
        Author author38 = authorService.createAuthor("Ray Bradbury", true);
        Author author39 = authorService.createAuthor("John Steinbeck", true);
        Author author40 = authorService.createAuthor("Harper Lee", true);
        Author author41 = authorService.createAuthor("Ernest Hemingway", true);
        Author author42 = authorService.createAuthor("Albert Camus", true);
        Author author43 = authorService.createAuthor("Oscar Wilde", true);
        Author author44 = authorService.createAuthor("Kurt Vonnegut", true);
        Author author45 = authorService.createAuthor("Philip K. Dick", true);
        Author author46 = authorService.createAuthor("George R.R. Martin", true);
        Author author47 = authorService.createAuthor("J.K. Rowling", true);
        Author author48 = authorService.createAuthor("Agatha Christie", true);
        Author author49 = authorService.createAuthor("Stephen King", true);
        Author author50 = authorService.createAuthor("Tolkien", true);

// Publishers
        Publisher publisher1 = publisherService.createPublisher("George Newnes Ltd", true);
        Publisher publisher2 = publisherService.createPublisher("Ediciones Colihue", true);
        Publisher publisher3 = publisherService.createPublisher("Alianza", true);
        Publisher publisher4 = publisherService.createPublisher("Penguin Classics", true);
        Publisher publisher5 = publisherService.createPublisher("HarperCollins", true);
        Publisher publisher6 = publisherService.createPublisher("Oxford University Press", true);
        Publisher publisher7 = publisherService.createPublisher("Random House", true);
        Publisher publisher8 = publisherService.createPublisher("Vintage Books", true);
        Publisher publisher9 = publisherService.createPublisher("Houghton Mifflin Harcourt", true);
        Publisher publisher10 = publisherService.createPublisher("Penguin Books", true);
        Publisher publisher11 = publisherService.createPublisher("Penguin Classics", true);
        Publisher publisher12 = publisherService.createPublisher("HarperCollins", true);
        Publisher publisher13 = publisherService.createPublisher("Oxford University Press", true);
        Publisher publisher14 = publisherService.createPublisher("Random House", true);
        Publisher publisher15 = publisherService.createPublisher("Vintage Books", true);
        Publisher publisher16 = publisherService.createPublisher("Houghton Mifflin Harcourt", true);
        Publisher publisher17 = publisherService.createPublisher("Penguin Books", true);
        Publisher publisher18 = publisherService.createPublisher("Macmillan", true);
        Publisher publisher19 = publisherService.createPublisher("Simon & Schuster", true);
        Publisher publisher20 = publisherService.createPublisher("Pantheon Books", true);
        Publisher publisher21 = publisherService.createPublisher("Vintage Español", true);
        Publisher publisher22 = publisherService.createPublisher("Everyman's Library", true);
        Publisher publisher23 = publisherService.createPublisher("Penguin Random House", true);
        Publisher publisher24 = publisherService.createPublisher("Penguin Popular Classics", true);
        Publisher publisher25 = publisherService.createPublisher("Little, Brown and Company", true);
        Publisher publisher26 = publisherService.createPublisher("Harper Perennial Modern Classics", true);
        Publisher publisher27 = publisherService.createPublisher("Signet Classics", true);
        Publisher publisher28 = publisherService.createPublisher("Ballantine Books", true);
        Publisher publisher29 = publisherService.createPublisher("Penguin Great Books of the 20th Century", true);
        Publisher publisher30 = publisherService.createPublisher("Bantam", true);
        Publisher publisher31 = publisherService.createPublisher("Scribner", true);
        Publisher publisher32 = publisherService.createPublisher("Vintage International", true);
        Publisher publisher33 = publisherService.createPublisher("Wordsworth Editions", true);
        Publisher publisher34 = publisherService.createPublisher("Del Rey", true);
        Publisher publisher35 = publisherService.createPublisher("Ace Books", true);
        Publisher publisher36 = publisherService.createPublisher("Bantam", true);
        Publisher publisher37 = publisherService.createPublisher("Bloomsbury Publishing", true);
        Publisher publisher38 = publisherService.createPublisher("Harper", true);
        Publisher publisher39 = publisherService.createPublisher("Scribner", true);
        Publisher publisher40 = publisherService.createPublisher("Houghton Mifflin Harcourt", true);

// Books
        bookService.createBook("9788420739533", "Las aventuras de Sherlock Holmes", 2005, 3, 0, 3, true, author1, publisher1);
        bookService.createBook("9781454908723", "Moby-Dick", 1851, 3, 0, 3, true, author2, publisher2);
        bookService.createBook("9780142000677", "Cien años de soledad", 1967, 3, 0, 3, true, author3, publisher3);
        bookService.createBook("9780451518040", "1984", 1949, 3, 0, 3, true, author4, publisher4);
        bookService.createBook("9780684801223", "El Gran Gatsby", 1925, 3, 0, 3, true, author5, publisher5);
        bookService.createBook("9780062072086", "Asesinato en el Orient Express", 1934, 3, 0, 3, true, author6, publisher6);
        bookService.createBook("9780451531574", "Las aventuras de Tom Sawyer", 1876, 3, 0, 3, true, author7, publisher7);
        bookService.createBook("9780140448041", "Cumbres Borrascosas", 1847, 3, 0, 3, true, author8, publisher8);
        bookService.createBook("9781523277523", "La metamorfosis", 1915, 3, 0, 3, true, author9, publisher9);
        bookService.createBook("9780743273565", "Harry Potter y la piedra filosofal", 1997, 3, 0, 3, true, author10, publisher10);
        bookService.createBook("9788497648190", "Diez negritos", 1939, 3, 0, 3, true, author11, publisher1);
        bookService.createBook("9780099590583", "América", 1931, 3, 0, 3, true, author12, publisher2);
        bookService.createBook("9782070408509", "La guerra de los mundos", 1898, 3, 0, 3, true, author13, publisher3);
        bookService.createBook("9780141439655", "La isla del tesoro", 1883, 3, 0, 3, true, author14, publisher4);
        bookService.createBook("9780060740445", "Matar a un ruiseñor", 1960, 3, 0, 3, true, author15, publisher5);
        bookService.createBook("9780743273565", "El viejo y el mar", 1952, 3, 0, 3, true, author16, publisher6);
        bookService.createBook("9781853260419", "Orlando", 1928, 3, 0, 3, true, author17, publisher7);
        bookService.createBook("9780141036144", "El extranjero", 1942, 3, 0, 3, true, author18, publisher8);
        bookService.createBook("9788496232674", "Orgullo y prejuicio", 1813, 3, 0, 3, true, author19, publisher9);
        bookService.createBook("9781857151164", "Guerra y paz", 1869, 3, 0, 3, true, author20, publisher10);
        bookService.createBook("9780141993309", "Crimen y castigo", 1866, 3, 0, 3, true, author21, publisher11);
        bookService.createBook("9780141439839", "Cumbres Borrascosas", 1847, 3, 0, 3, true, author22, publisher12);
        bookService.createBook("9780368201105", "El corazón de las tinieblas", 1899, 3, 0, 3, true, author23, publisher13);
        bookService.createBook("9780684801520", "El Gran Gatsby", 1925, 3, 0, 3, true, author24, publisher14);
        bookService.createBook("9780156907392", "Al faro", 1927, 3, 0, 3, true, author25, publisher15);
        bookService.createBook("9780345538376", "El hobbit", 1937, 3, 0, 3, true, author26, publisher16);
        bookService.createBook("9780450600120", "Beloved", 1987, 3, 0, 3, true, author27, publisher17);
        bookService.createBook("9780141439891", "Veinte mil leguas de viaje submarino", 1870, 3, 0, 3, true, author28, publisher18);
        bookService.createBook("9780575080165", "El horror de Dunwich", 1928, 3, 0, 3, true, author29, publisher19);
        bookService.createBook("9788499896121", "El lobo estepario", 1927, 3, 0, 3, true, author30, publisher20);
        bookService.createBook("9780307474728", "Cien años de soledad", 1967, 3, 0, 3, true, author31, publisher21);
        bookService.createBook("9781857152439", "Guerra y paz", 1869, 3, 0, 3, true, author32, publisher22);
        bookService.createBook("9780141439518", "Orgullo y prejuicio", 1813, 3, 0, 3, true, author33, publisher23);
        bookService.createBook("9780141439891", "Cuento de Navidad", 1843, 3, 0, 3, true, author34, publisher24);
        bookService.createBook("9780316769174", "El guardián entre el centeno", 1951, 3, 0, 3, true, author35, publisher25);
        bookService.createBook("9780060850524", "Un mundo feliz", 1932, 3, 0, 3, true, author36, publisher26);
        bookService.createBook("9780451524935", "1984", 1949, 3, 0, 3, true, author37, publisher27);
        bookService.createBook("9781451673319", "Fahrenheit 451", 1953, 3, 0, 3, true, author38, publisher28);
        bookService.createBook("9780142000670", "Las uvas de la ira", 1939, 3, 0, 3, true, author39, publisher29);
        bookService.createBook("9780446310789", "Matar a un ruiseñor", 1960, 3, 0, 3, true, author40, publisher30);
        bookService.createBook("9780684824291", "El viejo y el mar", 1952, 3, 0, 3, true, author41, publisher31);
        bookService.createBook("9782070413119", "El extranjero", 1942, 3, 0, 3, true, author42, publisher32);
        bookService.createBook("9780451528018", "El retrato de Dorian Gray", 1890, 3, 0, 3, true, author43, publisher33);
        bookService.createBook("9780385333849", "Matadero cinco", 1969, 3, 0, 3, true, author44, publisher34);
        bookService.createBook("9780345404473", "¿Sueñan los androides con ovejas eléctricas?", 1968, 3, 0, 3, true, author45, publisher35);
        bookService.createBook("9780553103540", "Juego de tronos", 1996, 3, 0, 3, true, author46, publisher36);
        bookService.createBook("9780747532743", "Harry Potter y la piedra filosofal", 1997, 3, 0, 3, true, author47, publisher37);
        bookService.createBook("9780062073483", "Diez negritos", 1939, 3, 0, 3, true, author48, publisher38);
        bookService.createBook("9780307743661", "El resplandor", 1977, 3, 0, 3, true, author49, publisher39);
        bookService.createBook("9780345339683", "El Señor de los Anillos", 1954, 3, 0, 3, true, author50, publisher40);
    }

    private static void findAuthorsByName() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("");
        System.out.println("Ingrese el nombre del autor: ");
        System.out.println("");
        String authorName = read.next();
        AuthorService authorService = new AuthorService();
        List<Author> authors = authorService.findAuthorByName(authorName);
        if (authors.isEmpty()) {
            System.out.println("");
            System.out.println("No se encontraron autores que coincidan con el criterio de búsqueda.");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Lista de autores que coinciden con el criterio de búsqueda:");
            System.out.println("");
            for (Author author : authors) {
                System.out.println(author.getName());
            }
            System.out.println("");
        }

        System.out.println("");
    }

//    private static void findBooksByISBN() {
//        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("");
//        System.out.println("Ingrese el ISBN del libro: ");
//        System.out.println("");
//        String isbn = read.next();
//        BookService bookService = new BookService();
//        List<Book> books = bookService.findBookByIsbn(isbn);
//        System.out.println("");
//        System.out.println("Lista de libros que coinciden con el criterio de búsqueda:");
//        System.out.println("");
//        for (Book book : books) {
//            System.out.println("ISBN: " + book.getIsbn() + " - Título: " + book.getTitle());
//        }
//        System.out.println("");
//    }
//    
//    private static void findBooksByTitle() {
//        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("");
//        System.out.println("Ingrese el título del libro: ");
//        System.out.println("");
//        String bookTitle = read.next();
//        BookService bookService = new BookService();
//        List<Book> books = bookService.findBookByTitle(bookTitle);
//        System.out.println("");
//        System.out.println("Lista de libros que coinciden con el criterio de búsqueda:");
//        System.out.println("");
//        for (Book book : books) {
//            System.out.println("ISBN: " + book.getIsbn() + " - Título: " + book.getTitle());
//        }
//        System.out.println("");
//    }
//    
//    private static void findBooksByAuthor() {
//        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("");
//        System.out.println("Ingrese el autor del libro: ");
//        System.out.println("");
//        String authorName = read.next();
//        BookService bookService = new BookService();
//        List<Book> books = bookService.findBookByAuthor(authorName);
//        System.out.println("");
//        System.out.println("Lista de libros que coinciden con el criterio de búsqueda:");
//        System.out.println("");
//        for (Book book : books) {
//            System.out.println("ISBN: " + book.getIsbn() + " - Título: " + book.getTitle());
//        }
//        System.out.println("");
//    }
//    
//    private static void findBooksByPublisher() {
//        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.println("");
//        System.out.println("Ingrese la editorial del libro: ");
//        System.out.println("");
//        String publisher = read.next();
//        BookService bookService = new BookService();
//        List<Book> books = bookService.findBookByPublisher(publisher);
//        System.out.println("");
//        System.out.println("Lista de libros que coinciden con el criterio de búsqueda:");
//        System.out.println("");
//        for (Book book : books) {
//            System.out.println("ISBN: " + book.getIsbn() + " - Título: " + book.getTitle());
//        }
//        System.out.println("");
//    }
    private static void findBooks(String field) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("");

        switch (field) {
            case "author":
                System.out.println("Ingrese el autor del libro: ");
                break;
            case "title":
                System.out.println("Ingrese el título del libro: ");
                break;
            case "publisher":
                System.out.println("Ingrese la editorial del libro: ");
                break;
            case "isbn":
                System.out.println("Ingrese el ISBN del libro: ");
                break;
        }

        System.out.println("");
        String value = read.next();
        BookService bookService = new BookService();
        List<Book> books = bookService.findBooks(field, value);
        if (books.isEmpty()) {
            System.out.println("");
            System.out.println("No se encontraron libros que coincidan con el criterio de búsqueda.");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Lista de libros que coinciden con el criterio de búsqueda:");
            System.out.println("");
            for (Book book : books) {
                System.out.println("ISBN: " + book.getIsbn() + " - Título: " + book.getTitle() + " - Autor: " + book.getAuthor().getName() + " - Editorial: " + book.getPublisher().getName());
            }
        }

        System.out.println("");
    }

}
