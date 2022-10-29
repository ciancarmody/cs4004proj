package org.example;

import java.time.LocalDateTime;
public class Book{
    private String author;
    private LocalDateTime releaseDate;
    private String title;
    private String edition;
    private String publisher;
    Book(String author, LocalDateTime releaseDate, String title, String edition, String publisher){
        this.author = author;
        this.releaseDate = releaseDate;
        this.title = title;
        this.edition = edition;
        this.publisher = publisher;
    }

    public String toString(){
        String str = String.format("%s, %tB %<te, %<tY, %s, edition: %s, %s",author,releaseDate,title,edition,publisher);
        return str;
    }

    //start auth
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //start date
    public LocalDateTime getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate){
        this.releaseDate = releaseDate;
    }

    //start title
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //start edition
    public String getEdition(){
        return edition;
    }

    public void setEdition(String edition){
        this.edition = edition;
    }

    //start publisher
    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}
