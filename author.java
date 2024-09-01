package models;

import java.util.Date;

public class author {
    private int id_author;
    private String code_book;
    private String name;
    private String title;
    private String publisher;
    private char sbn;
    private Date create_at;
    private Date update_at;

    public author(){

    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getCode_book() {
        return code_book;
    }

    public void setCode_book(String code_book) {
        this.code_book = code_book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public char getSbn() {
        return sbn;
    }

    public void setSbn(char sbn) {
        this.sbn = sbn;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
