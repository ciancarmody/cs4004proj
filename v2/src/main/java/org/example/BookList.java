package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BookList{
    private String listName;

    private ArrayList<String> departments = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList();

    BookList(String listName){
        this.listName = listName;
    }

    BookList(String listName, String departments){
        this.listName = listName;
        String[] arr = departments.split(", ");
        this.departments.addAll(Arrays.asList(arr));//has departments so u can make a boooklist of only one
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addBook(String author, String releaseDate, String title, String edition, String publisher, String departments){
        Book newBook = new Book(author, releaseDate, title, edition, publisher, departments);
        books.add(newBook);
    }

    public ArrayList<Book> getBookList(){
        return books;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Book b: books){
            s.append(b.toString());
            s.append("\n");
        }
        return s.toString();
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void addDepartments(String dep){
        String[] arr = dep.split(", ");
        this.departments.addAll(Arrays.asList(arr));
    }

    public String getDepartmentString(){
        StringBuilder str = new StringBuilder();
        for(String s:departments){
            str.append(s).append(", ");
        }
        str.delete(str.length() - 2, str.length());
        return str.toString();
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public String infoString(){
        return String.format("List name: %s\nDepartments: %s\n",listName,getDepartmentString());
    }
}
