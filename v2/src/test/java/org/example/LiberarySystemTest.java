package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LiberarySystemTest{
    ArrayList<Book> masterListTest = new ArrayList<>();
    ArrayList<Book> aListTest = new ArrayList<>();
    //BookList aListTest = new BookList("a");

    Book b1 = new Book("author","01/01/0001","title1","ed","pub");
    Book b2 = new Book("author","01/01/0001","title2","ed","pub","a");
    Book b3 = new Book("author","01/01/0001","title3","ed","pub","a, b");
    Book b4 = new Book("author","01/01/0001","title4","ed","pub","b, c");

    @Test
    public void departmentBookLists(){
        LiberarySystem sys = new LiberarySystem();

        sys.addBook(b1);
        sys.addBook(b2);
        sys.addBook(b3);
        sys.addBook(b4);

        masterListTest.add(b1);
        masterListTest.add(b2);
        masterListTest.add(b3);
        masterListTest.add(b4);

        aListTest.add(b1);
        aListTest.add(b2);
        aListTest.add(b3);

        assertEquals(masterListTest, sys.getBookList());
        assertEquals(aListTest, sys.getBookList("a"));
    }
}


















