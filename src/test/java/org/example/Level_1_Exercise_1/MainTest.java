package org.example.Level_1_Exercise_1;

import org.example.Level_1_Exercise_1.Modules.Book;
import org.example.Level_1_Exercise_1.Modules.BookManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private BookManagement bookManagement;
    @BeforeEach
    void setUp() {
        bookManagement=new BookManagement();
    }
    @Test
    void testListIsNotNullAfterCreate() {
        assertNotNull(bookManagement.getBooks());
    }

    @Test
    void testListSizeAfterAddBooks() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBook(new Book("Book 2"));
        assertEquals(2, bookManagement.getBooks().size());
    }

    @Test
    void testContentCorrectInPosition() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBook(new Book("Book 2"));
        bookManagement.addBook(new Book("Book 3"));
        assertEquals("Book 1", bookManagement.bookTitleByPosition(0));
        assertEquals("Book 3", bookManagement.bookTitleByPosition(2));
    }
}