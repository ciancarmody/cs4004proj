package org.example;

import java.time.LocalDate;

public class Loan{
    private Book book;
    private LocalDate dateTaken;
    private LocalDate dateReturned;
    private Person loanedTo;

    private boolean returned;

    private boolean overTime;
    private LocalDate dueDate;


    Loan(Book book, Person loanedTo)throws RuntimeException{
        if(!book.getAvailble()){
            throw new RuntimeException("That book is already out on loan");
        }
        this.book = book;
        this.loanedTo = loanedTo;
        dateTaken = LocalDate.now();
        dateReturned = null;
        overTime = false;
        dueDate = dateTaken.plusWeeks(3);
        returned = false;
        book.setAvailble(false);
    }

    public Book getBook(){
        return book;
    }

    public Person getLoanedTo(){
        return loanedTo;
    }

    public LocalDate getDateTaken(){
        return dateTaken;
    }

    public LocalDate getDateReturned(){
        return dateReturned;
    }

    public void returnBook(){
        returned = true;
        this.dateReturned = LocalDate.now();
        book.setAvailble(true);
    }

    public void returnBook(LocalDate d){
        returned = true;
        this.dateReturned = d;
        book.setAvailble(true);
    }

    public boolean getReturnStatus(){
        if(!returned){
            if(LocalDate.now().isAfter(dueDate)){
                overTime = true;
            }else{
                overTime = false;
            }
        }else{
            if(dateReturned.isAfter(dueDate)){
                overTime = true;
            }else{
                overTime = false;
            }
        }
        return returned;
    }

    public boolean getIfLate(){
        getReturnStatus();
        return overTime;
    }

    public String toString(){
        getIfLate();
        String dateRet = String.format("returned: %tB %<te, %<tY",dateReturned);
        if(overTime && returned){
            dateRet = dateRet + ", late";
        }else if(overTime){
            dateRet = "over time; needs to be returned";
        }else if(dateReturned == null){
            dateRet = "still out on loan";
        }
        return String.format("Loaned: %s: edition: %s, to: %s, removed on %tB %<te, %<tY, %s"
                ,book.getTitle(),book.getEdition(),loanedTo.getName(),dateTaken,dateRet);
    }
}











