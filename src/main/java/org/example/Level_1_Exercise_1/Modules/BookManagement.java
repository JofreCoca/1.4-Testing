package org.example.Level_1_Exercise_1.Modules;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books;
    public BookManagement() {
        this.books = books=new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.books.add(book);
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
