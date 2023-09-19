package com.example.shorturl.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlService {

    @GetMapping("/")
    public String homePage(Model model, String shortUrl, @ModelAttribute("originalUrl") String originalUrl) {
        shortUrl = "https://23lkj43";

        model.addAttribute("shortUrl", shortUrl);

        System.out.println(model.getAttribute(originalUrl));

        return "index";
    }

}
