package org.example;

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
}