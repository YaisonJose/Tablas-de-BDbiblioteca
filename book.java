package models;

public class book {
    private int id;
    private int code_book;
    private String name;
    private String title;
    private String publisher;
    private char sbn;
    private String create_at;
    private String update_at ;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode_book() {
        return code_book;
    }

    public void setCode_book(int code_book) {
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

    public char getSbn() {
        return sbn;
    }

    public void setSbn(char sbn) {
        this.sbn = sbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
