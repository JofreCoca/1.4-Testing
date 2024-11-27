package org.example.Level_1_Exercise_1.Modules;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books;
    public BookManagement() {
        this.books = books=new ArrayList<Book>();
    }

    public void addBook(Book book){
        boolean existBook=false;
        for (Book readArrayBooks : this.books) {
            if(book.getTitle().equalsIgnoreCase(readArrayBooks.getTitle())){
                existBook=true;
            }
        }
        if(existBook==false){
            this.books.add(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String bookTitleByPosition(int position){
        String title=null;
        title=this.books.get(position).getTitle();
        return title;
    }

    public void addBookSpecificPosition(int position,Book book){
        this.books.add(position,book);
    }

    public void removeBookByTitle(String title){
        int i=0;
        boolean found=false;
        while(i<this.books.size()&&found==false){
            if(this.books.get(i).getTitle().equalsIgnoreCase(title)){
                this.books.remove(i);
                found=true;
            }
            i++;
        }
    }
}
