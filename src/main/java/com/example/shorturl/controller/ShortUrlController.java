package com.example.shorturl.controller;

import com.example.shorturl.model.ErrorResponseDto;
import com.example.shorturl.model.Link;
import com.example.shorturl.model.LinkDto;
import com.example.shorturl.service.UrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ShortUrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/")
    public ResponseEntity<?> createShortUrl(@RequestParam String originalUrl, Model model) {
        Link link = urlService.createUrlShortLink(originalUrl);

        if(link != null) {
            LinkDto linkDto = new LinkDto();
            linkDto.setOriginalUrl(link.getOriginalLink());
            linkDto.setShortenedUrl(link.getShortenedLink());
            model.addAttribute("shortUrl", "linkDto.getShortenedUrl()");
            return new ResponseEntity<>(linkDto, HttpStatus.OK);
        } else return new ResponseEntity<>(new ErrorResponseDto(HttpStatus.NOT_FOUND.value(), "Link not found"),
                HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity<?> redirectToOriginalUrl(@PathVariable String shortUrl, HttpServletResponse response) throws IOException {

        Link link = urlService.getEncodedShortLink(shortUrl);

        if(shortUrl.isEmpty() || link == null)
            return new ResponseEntity<>(new ErrorResponseDto(HttpStatus.NOT_FOUND.value(), "Link not found"),
                    HttpStatus.NOT_FOUND);

        response.sendRedirect(link.getOriginalLink());

        return null;
    }
}
