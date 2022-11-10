package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Book{
    private String author;
    private String releaseDate;
    private String title;
    private String edition;
    private String publisher;

    private boolean availble;
    private ArrayList<String> departments = new ArrayList<>();
    Book(String author, String releaseDate, String title, String edition, String publisher, String departments){
        this.author = author;
        this.releaseDate = releaseDate;
        this.title = title;
        this.edition = edition;
        this.publisher = publisher;//regular add data
        String[] arr = departments.split(", ");//split up depatments list so it can add to arry
        this.departments.addAll(Arrays.asList(arr));
        availble = true;//stop ppl from taking out books that r alredy out
    }

    //start auth
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //start date
    public String getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate){
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

    public ArrayList<String> getDepartments(){
        return departments;
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
        return str.toString();//string just for departments cuz its awkward
    }

    public boolean getAvailble(){
        return availble;
    }

    public void setAvailble(boolean boo){
        availble = boo;
    }

    public String toString(){
        return String.format("%s, %s, %s, edition: %s, %s, departments: %s",author,releaseDate,title,edition,publisher,getDepartmentString());
    }

}
