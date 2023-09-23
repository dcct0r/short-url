package com.example.shorturl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "short_url")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "original_url", columnDefinition = "text", length = 1024)
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

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setShortenedLink(String shortenedLink) {
        this.shortenedLink = shortenedLink;
    }

    public String getShortenedLink() {
        return shortenedLink;
    }
}
