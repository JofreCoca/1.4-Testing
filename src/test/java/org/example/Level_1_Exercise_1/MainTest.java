package org.example.Level_1_Exercise_1;

import org.example.Level_1_Exercise_1.Modules.Book;
import org.example.Level_1_Exercise_1.Modules.BookManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void testNoDuplicates() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBook(new Book("Book 1"));
        assertEquals(1, bookManagement.getBooks().size());
    }

    @Test
    void testRecoverTitleInPosition() {
        bookManagement.addBook(new Book("Book 1"));
        assertEquals("Book 1", bookManagement.bookTitleByPosition(0));
    }

    @Test
    void testAddInPosition() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBookSpecificPosition(0, new Book("Book 0"));
        List<Book> books = bookManagement.getBooks();
        assertTrue(books.contains(new Book("Book 0")));
        assertEquals(new Book("Book 1"), books.get(1));
    }

    @Test
    void testRemoveBook() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBook(new Book("Book 2"));
        bookManagement.removeBookByTitle("Book 1");
        assertEquals(1, bookManagement.getBooks().size());
        assertFalse(bookManagement.getBooks().contains(new Book("Book 1")));
    }
    @Test
    void testAlphabeticallySortedList() {
        bookManagement.addBook(new Book("Book 1"));
        bookManagement.addBook(new Book("Book 2"));
        bookManagement.addBook(new Book("Book 3"));
        List<Book> books = bookManagement.getBooks();
        assertEquals(List.of(new Book("Book 1"),new Book("Book 2"),new Book("Book 3")), books);
        bookManagement.removeBookByTitle("Book 1");
        books = bookManagement.getBooks();
        assertEquals(List.of(new Book("Book 2"),new Book("Book 3")), books);
    }
}