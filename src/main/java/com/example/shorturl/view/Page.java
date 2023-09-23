package com.example.shorturl.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
