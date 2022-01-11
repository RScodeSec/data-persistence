package com.rs.message;

public class Message {
    private int id_message;
    private String message;
    private String author;
    private String date;

    public Message(){

    }

    public Message(String message, String author, String date) {
        this.message = message;
        this.author = author;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }
}
