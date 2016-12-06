package com.example.entity;

public class Book extends AbstractEntity {
    private String title;
    private String genre;
    private String author;
    private String pulished;
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }
    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return the pulished
     */
    public String getPulished() {
        return pulished;
    }
    /**
     * @param pulished the pulished to set
     */
    public void setPulished(String pulished) {
        this.pulished = pulished;
    }
}
