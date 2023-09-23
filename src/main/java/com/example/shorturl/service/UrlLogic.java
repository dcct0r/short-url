package com.example.shorturl.service;

import com.example.shorturl.model.Link;
import com.example.shorturl.repo.LinkRepository;
import com.google.common.hash.Hashing;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class UrlLogic implements UrlService {

    @Autowired
    private LinkRepository linkRepository;

    @Override
    public Link createUrlShortLink(String url) {
        UrlValidator urlValidator = new UrlValidator();
        if(urlValidator.isValid(url)) {
            Link linkToCreate = new Link();
            linkToCreate.setOriginalLink(url);
            linkToCreate.setShortenedLink(shortUrl(url));
            Link linkToSave = saveLink(linkToCreate);
            return linkToSave;
        }
        return null;
    }

    @Override
    public Link getEncodedShortLink(String url) {
        Link link = linkRepository.findLinkByShortenedLink(url);
        return link;
    }

    @Override
    public Link saveLink(Link link) {
        Link linkToSave = linkRepository.save(link);
        return linkToSave;
    }

    private static String shortUrl(String url) {
        return Hashing.murmur3_32_fixed().hashString(url, StandardCharsets.UTF_8).toString();
    }
}
