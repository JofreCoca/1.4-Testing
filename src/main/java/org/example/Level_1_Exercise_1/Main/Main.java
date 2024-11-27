package org.example.Level_1_Exercise_1.Main;
import org.example.Level_1_Exercise_1.Modules.Book;
import org.example.Level_1_Exercise_1.Modules.BookManagement;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        BookManagement bookManagement=new BookManagement();

        bookManagement.addBook(new Book("Hamlet"));
        bookManagement.addBook(new Book("Odyssey"));

        System.out.println(bookManagement.bookTitleByPosition(1));

        bookManagement.addBookSpecificPosition(1,new Book("Romeo and Juliet"));

        ArrayList<Book> books =bookManagement.getBooks();

        System.out.println("__________________");
        for (Book readArrayBooks : books) {
            System.out.println(readArrayBooks);
        }

        bookManagement.removeBookByTitle("Odyssey");

        System.out.println("__________________");
        for (Book readArrayBooks : books) {
            System.out.println(readArrayBooks);
        }
    }
}