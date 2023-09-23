package com.example.shorturl.service;

import com.example.shorturl.model.Link;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {
    public Link createUrlShortLink(String originalUrl);
    public Link getEncodedShortLink(String url);
    public Link saveLink(Link link);
}
