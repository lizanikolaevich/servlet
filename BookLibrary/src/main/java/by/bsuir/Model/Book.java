/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.Model;

/**
 *
 * @author user
 */
public class Book extends PrintPublication{
    
    private String autor;
    private String genre;
    private char isbn;
    private int birthday_autor;
    private int city;
    private int publish_year;
    
    public Book(int id, int data_post, int count,String name) {
        super(id, data_post, count,name);
    }
    

    public void Book(String autor, String genre, int birthday_autor, char isbn, int publish_year, int city){
        this.autor = autor;
        this.genre = genre;
        this.birthday_autor = birthday_autor;
        this.isbn = isbn;
        this.city = city;
        this.publish_year = publish_year;
}
      public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBirthday_autor(){
        return this.birthday_autor;
    }

    public void setBirthday_autor (int birthday_autor){
        this.birthday_autor = birthday_autor;
    }
    public int getIsbn(){
        return this.isbn;
    }

    public void setIsbn (char isbn){
        this.isbn = isbn;
    }
        public int getPublish_year(){
        return this.publish_year;
    }

    public void setPublish_year (char publish_year){
        this.publish_year = publish_year;
    }
        public int getCity(){
        return this.city;
    }

    public void setCity (char city){
        this.city = city;
    }
}
