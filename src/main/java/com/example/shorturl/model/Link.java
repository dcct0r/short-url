package com.example.shorturl.model;

public class Link {
    private String originalLink, shortenedLink;

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
