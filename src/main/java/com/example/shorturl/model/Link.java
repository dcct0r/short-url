package com.example.shorturl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "short_url")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "original_url")
    private String originalLink;
    @Column(name = "shortened_url")
    private String shortenedLink;

    public Link() {}

    public Link(String originalLink) {
        this.originalLink = originalLink;
    }

    public Link(String originalLink, String shortenedLink) {
        this.originalLink = originalLink;
        this.shortenedLink = shortenedLink;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getShortenedLink() {
        return shortenedLink;
    }

    public void setShortenedLink(String shortenedLink) {
        this.shortenedLink = shortenedLink;
    }
}
