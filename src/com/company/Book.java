package com.company;

public class Book {
    private String name;
    private String author;
    private String publisher;

    public Book (String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String toString() {
        return "Название: " + this.name + ", автор: " + this.author + ", издатель: " + this.publisher;
    }

}