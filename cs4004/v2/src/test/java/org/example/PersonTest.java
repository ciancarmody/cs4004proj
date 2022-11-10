package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest{

    String name = "Alex Butler";
    String email = "alex@gmail.com";
    ArrayList<Loan> goalLoans = new ArrayList<Loan>();
    Person p1 = new Person(name, email,"a");
    Person p2 = new Person("a", "a@b.com","a");

    Book b1 = new Book("a1", "2035-06-15","title1","1","pub1", "a");
    Book b2 = new Book("a2", "2035-06-15","title2","1","pub2", "a");
    Loan l1 = new Loan(b1,p1);
    Loan l2 = new Loan(b2,p2);

    @Test
    public void testPerson(){

        goalLoans.add(l1);

        p1.addLoan(l1);
        p1.addLoan(l1);
        assertEquals(goalLoans, p1.getLoans());

        String str = String.format("Name: %s, Email: %s", name,email);
        assertTrue(p1.toString().matches(str));
    }

    @Test
    public void testThrowEmail(){
        assertThrows(RuntimeException.class, () -> new Person("Eric Delano", "edel@gmailcom","a"));
        assertThrows(RuntimeException.class, () -> new Person("Eric Delano", "edelgmail.com","a"));
        assertThrows(RuntimeException.class, () -> new Person("Eric Delano", "@.","a"));
        assertThrows(RuntimeException.class, () -> new Person("Eric Delano", "vhfudsbavi","a"));
    }

    @Test
    public void testThrowLoan(){
        assertThrows(RuntimeException.class, () -> p1.addLoan(l2));
    }
}
