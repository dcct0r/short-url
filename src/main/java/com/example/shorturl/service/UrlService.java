package com.example.shorturl.service;

import com.example.shorturl.model.Link;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class UrlService {

    @GetMapping("/")
    public String setShortUrl(Model model) {
        String testShortUrl = "https://lk234rf";
        model.addAttribute("shortUrl", testShortUrl);

        return "index";
    }

    @PostMapping("/")
    public String getOriginalUrl(Model model, @RequestParam String originalUrl) {

        Link link = new Link(originalUrl);
        String temp = link.getOriginalLink();
        System.out.println(temp);

        return "index";
    }

}
