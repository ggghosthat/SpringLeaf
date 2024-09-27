package com.ggghosthat.firstleaf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping("/about")
    public String About() {
        return "this is the about page!";
    }
}
