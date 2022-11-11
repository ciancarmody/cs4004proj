package org.example;

import java.util.ArrayList;

public class LiberarySystem{
    public static String in;
    private BookList masterList = new BookList();

    public void addBook(Book book){
        masterList.addBook(book);
    }

    public ArrayList<Book> getBookList(){
        return masterList.getBookList();
    }

    public ArrayList<Book> getBookList(String departments){
        BookList ret = new BookList(departments);
        for(String retDep:ret.getDepartments()){
            for(Book b: masterList.getBookList()){
                if(b.getDepartments().isEmpty()){
                    ret.addBook(b);
                }else{
                    for(String bookDep : b.getDepartments()) {
                        if (retDep.matches(bookDep)) {
                            ret.addBook(b);
                            break;
                        }
                    }
                }
            }
        }
        return ret.getBookList();
    }

}
